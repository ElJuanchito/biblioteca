package co.edu.uniquindio.biblioteca.model;

public class Libro {

    private String titulo;
    private String autor;
    private String editorial;

    /**
     * Metodo constructor para la clase Libro
     * @param titulo
     * @param autor
     * @param editorial
     */
    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString(){
    	return "Titulo: " + titulo + ", Autor: " + autor + ", Editorial: " + editorial;
    }

    public boolean verificarAutor(String autor){
    	return this.autor.equals(autor);

    }


}
