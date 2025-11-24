package udla.gtomas.Prueba.bilioteca;
import java.util.ArrayList;
/**Creacion subclase: Biblioteca*/
public class Biblioteca extends  Recurso  {
    private String nombre;
    private String direccion;

    /**Instanciacion del constructor*/
    public Biblioteca() {
    }
    /**Metodos de JAVA*/
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setListaRecursos(ArrayList<Recurso> listaRecursos) {
        this.listaRecursos = listaRecursos;
    }

    private String telefono;
    private int capacidad;
    private ArrayList<Recurso> listaRecursos;

    public Biblioteca(String nombre, String direccion, String telefono, int capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.capacidad = capacidad;
        this.listaRecursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    /**Metodos del programador*/
    public void agregarRecurso(Recurso recurso) {
        if (listaRecursos.size() < capacidad) {
            listaRecursos.add(recurso);
            System.out.println("Producto agregado");
        } else {
            System.out.println("Producto no agregado");

        }
    }
    public ArrayList<Recurso> getListaRecursos() {
        return listaRecursos;
    }

    public String datosBiblioteca() {
        return "Biblioteca: " + nombre + " | Dir: " + direccion;
    }
}