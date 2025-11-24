package udla.gtomas.Prueba.bilioteca;
/**Creacion Super-clase : Recurso*/
public class Recurso {
    private String titulo;
    private String autor;
    private String isbn;
    /**Instanciacion del constructor*/
    public Recurso() {
    }
/**Metodos de JAVA*/
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDisponible(int i) {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private double precio;
    private String disponible;
    private String tipo;

    public Recurso(String titulo, String autor, String isbn, double precio, String disponible, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.disponible = disponible;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }
    /**Metodos del programador*/
    public String datosRecursos() {
        return "[" + tipo + "] Titulo: " + titulo + " | Autor: " + autor + " | Precio: $" + precio;
    }
}
