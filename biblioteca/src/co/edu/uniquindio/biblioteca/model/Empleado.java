package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class Empleado {
	private String nombre;
	private Double salario;
	private String cargo;
	private ArrayList<Prestamo> listPrestamos;

	/**
	 *Metodo constructor para la clase empleado
	 * @param nombre
	 * @param salario
	 * @param cargo
	 */
	public Empleado(String nombre, Double salario, String cargo) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.cargo = cargo;
		this.listPrestamos = new ArrayList<Prestamo>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public ArrayList<Prestamo> getListPrestamos() {
		return listPrestamos;
	}
	public void setListPrestamos(ArrayList<Prestamo> listPrestamos) {
		this.listPrestamos = listPrestamos;
	}
}
