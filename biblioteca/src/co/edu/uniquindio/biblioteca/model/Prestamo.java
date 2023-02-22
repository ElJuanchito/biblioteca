package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class Prestamo {
	private String fecha;
	private Double total;
	private Integer tiempoEntrega;
	private String codigo;
	private ArrayList <DetallePrestamo> listDetallePrestamo;


	/**
	 * Metodo constructor para la clase Pestamo;
	 * @param fecha
	 * @param total
	 * @param tiempoEntrega
	 * @param codigo
	 */
	public Prestamo(){

	}
	public Prestamo(String fecha, Double total, Integer tiempoEntrega, String codigo) {
		super();
		this.fecha = fecha;
		this.total = total;
		this.tiempoEntrega = tiempoEntrega;
		this.codigo = codigo;
		this.listDetallePrestamo = new ArrayList<DetallePrestamo>();
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Integer getTiempoEntrega() {
		return tiempoEntrega;
	}
	public void setTiempoEntrega(Integer tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public ArrayList <DetallePrestamo> getListDetallePrestamo() {
		return listDetallePrestamo;
	}
	public void setListDetallePrestamo(ArrayList <DetallePrestamo> listDetallePrestamo) {
		this.listDetallePrestamo = listDetallePrestamo;
	}

	@Override
	public String toString(){
		return "Fecha: " + fecha + ", Total: " + total + ", TiempoEntrega: " + tiempoEntrega + ", Codigo: " + codigo;
	}
	public boolean verificarTotalAutor(String autor, double total) {

		return totalVerificado(total) && autorVerificado(autor);
	}
	private boolean autorVerificado(String autor) {
		for (DetallePrestamo detallePrestamo : listDetallePrestamo) {
			if(detallePrestamo.getLibro().verificarAutor(autor)){
				return true;
			}
		}
		return false;
	}
	private boolean totalVerificado(double total2) {
		return getTotal() == total2;
	}


}
