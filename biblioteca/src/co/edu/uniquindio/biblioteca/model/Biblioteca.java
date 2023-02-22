package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Biblioteca {


	//ATRIBUTOS
	private String nombre;
	private String direccion;
	private String telefono;
	private ArrayList<Estudiante> listaEstudiantes;
	private ArrayList<Libro> listaLibros;
	private ArrayList<Prestamo> listPrestamos;

	public Biblioteca() {

	}

	/**
	 * Este es el metodo constructor de la clase biblioteca
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 */
	public Biblioteca(String nombre, String direccion, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.listaEstudiantes = new ArrayList<Estudiante>();
		this.listaLibros = new ArrayList<Libro>();
		this.listPrestamos = new ArrayList<Prestamo>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public ArrayList<Prestamo> getListPrestamos() {
		return listPrestamos;
	}

	public void setListPrestamos(ArrayList<Prestamo> listPrestamos) {
		this.listPrestamos = listPrestamos;
	}

	/**
	 * Este metodo permite crear un estudiante
	 * @param nombres
	 * @param apellidos
	 * @param edad
	 * @param programa
	 * @param estado
	 * @param identificacion
	 * @throws Exception
	 */
	public String crearEstudiante(String nombres, String apellidos, Integer edad, String programa, String estado,
			String identificacion) throws Exception{

		String mensaje = "El estudiante ha sido registrado";
		boolean estudianteEncontrado = verificarEstudiante(identificacion);
		if( estudianteEncontrado == true){
			throw new Exception("El estudiante ya existe");
		}else{
			Estudiante nuevoEstudiante = new Estudiante(nombres, apellidos, edad, programa, estado, identificacion);
			listaEstudiantes.add(nuevoEstudiante);
		}
		return mensaje;
	}

	/**
	 * Obtener un estudiante
	 * @param identificacion
	 * @return
	 */
	public Estudiante obtenerEstudiante (String identificacion){

		Estudiante estudianteEncontrado = null;

		for (Estudiante estudiante : listaEstudiantes) {
			if(estudiante.getIdentificacion().equals(identificacion)){
				estudianteEncontrado = estudiante;
			}
		}
		return estudianteEncontrado;
	}

	public void eliminarEstudiante(String identificacion) throws Exception
	{
		if(verificarEstudiante(identificacion)==false)
		{
			throw new Exception("El estudiante no esta registrado");
		}
		else
		{
			for(int i=0; i<listaEstudiantes.size();i++)
			{
				if(listaEstudiantes.get(i).getIdentificacion().equals(identificacion))
				{
					listaEstudiantes.remove(i);
				}
			}
		}
	}


	public void eliminarEstudiante2(String identificacion) throws Exception
	{
		Estudiante estudianteEncontrado = obtenerEstudiante(identificacion);
		if(estudianteEncontrado == null){
			throw new Exception("El estudiante no esta registrado");
		}
		listaEstudiantes.remove(estudianteEncontrado);
	}
	public String actualizarEstudiante(String nombres , String apellidos , String identificacion, Integer edad) throws Exception{
		Estudiante estudianteEncontrado = obtenerEstudiante(identificacion);
		if(estudianteEncontrado == null){
			throw new Exception("El estudiante no esta registrado");
		}
       estudianteEncontrado.setNombres(nombres);
       estudianteEncontrado.setApellidos(apellidos);

       estudianteEncontrado.setEdad(edad);

       return " El estudiante ha sido actualizado " ;
	}


	public void ordenarLibrosPorISBN() {
        Collections.sort(listaEstudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante estudiante1, Estudiante estudiante2) {
                return estudiante1.getIdentificacion().compareTo(estudiante2.getIdentificacion());
            }
        });
    }



	/**
	 *
	 * @param identificacion
	 * @return
	 */
	private boolean verificarEstudiante(String identificacion) {
		boolean verificado = false;
		for (Estudiante estudianteaux : listaEstudiantes) {
			if(estudianteaux.getIdentificacion().equals(identificacion)){
				verificado = true;
				return verificado;
			}
		}
		return verificado;
	}

	/*
	private boolean verificarEdad(int edad){
		return listaEstudiantes.getEdad() > edad;
	}
	*/

	public ArrayList<Estudiante> getEstudiantesPorEdad(int edad){

		ArrayList<Estudiante> myList = new ArrayList<Estudiante>();

		for(Estudiante estudianteAux : listaEstudiantes){
			if(estudianteAux.getEdad() >= edad){
				myList.add(estudianteAux);
			}
		}

		return myList;
	}

	//obtener prestamos con total mayor a 20.000 y se haya prestado el libro con autor = Gabriel Garcia
		public ArrayList<Prestamo> getPrestamos(String autor, double total){

			ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

			for(Prestamo prestamoAux: listPrestamos){
				if(prestamoAux.verificarTotalAutor(autor, total)){
					prestamos.add(prestamoAux);
				}
			}
			return prestamos;
		}

		public Prestamo buscarAutorPrestamo(String autor, double total){
			for (Prestamo prestamo : listPrestamos) {
				if(prestamo.verificarTotalAutor(autor, total)) return prestamo;
			}
			return null;
		}


}
