package co.edu.uniquindio.biblioteca.model;

public class DetallePrestamo {

	private String codigo;
	private Double subTotal;
	private Integer cantidad;
	private Libro libro;

	/**
	 * Metodo constructor para DetallePrestamo.
	 * @param codigo
	 * @param subTotal
	 * @param cantidad
	 * @param libro
	 */
	public DetallePrestamo(String codigo, Double subTotal, Integer cantidad, Libro libro) {
		super();
		this.codigo = codigo;
		this.subTotal = subTotal;
		this.cantidad = cantidad;
		this.libro = libro;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

}
