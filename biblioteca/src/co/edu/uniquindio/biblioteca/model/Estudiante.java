package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class Estudiante {


	private String nombres;
	private String apellidos;
	private Integer edad;
	private String programa;
	private String estado;
	private String identificacion;
	private ArrayList<Prestamo> listPrestamos;


	public Estudiante() {
	}

	/**
	 *
	 * @param nombres
	 * @param apellidos
	 * @param edad
	 * @param programa
	 * @param estado
	 * @param identificacion
	 */
	public Estudiante(String nombres, String apellidos, Integer edad, String programa, String estado,
			String identificacion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.programa = programa;
		this.estado = estado;
		this.identificacion = identificacion;
		this.listPrestamos = new ArrayList<Prestamo>();
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	@Override
	public String toString() {
		return "Estudiante [nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", programa="
				+ programa + ", estado=" + estado + ", identificacion=" + identificacion + "]";
	}

	public ArrayList<Prestamo> getListPrestamos() {
		return listPrestamos;
	}

	public void setListPrestamos(ArrayList<Prestamo> listPrestamos) {
		this.listPrestamos = listPrestamos;
	}

	//obtener prestamos con total mayor a 20.000 y se haya prestado el libro con autor = Gabriel Garcia




}
