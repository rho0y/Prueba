package udla.gtomas.Prueba.bilioteca;
/**Creacion subclase Bibliotecario*/
public class Bibliotecario extends  Recurso {
    private String nombre;
    private String id;
    private String turno;
/**Instanciacion del constructor*/
    public Bibliotecario() {
    }
    /**Metodos de JAVA*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setBibliotecaAsignada(Biblioteca bibliotecaAsignada) {
        this.bibliotecaAsignada = bibliotecaAsignada;
    }

    private double salario;
    private Biblioteca bibliotecaAsignada;

    public Bibliotecario(String nombre, String id, String turno, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.turno = turno;
        this.salario = salario;
    }
/**Metodos del programador*/
    public void asignarBiblioteca(Biblioteca biblioteca) {
        this.bibliotecaAsignada = biblioteca;
        System.out.println("Bibleoteca designada " + this.nombre);
    }

    public Biblioteca getBibliotecaAsignada() {
        return bibliotecaAsignada;
    }

    public String asignacionBibliotecario() {
        String nombreBiblioteca = "Sin asignar";
        if (bibliotecaAsignada != null) {
            nombreBiblioteca = bibliotecaAsignada.getNombre();
        }
        return "Bibliotecario: " + nombre + " | Turno: " + turno + " | Biblioteca: " + nombreBiblioteca;
    }
}