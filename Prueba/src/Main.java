import udla.gtomas.Prueba.bilioteca.Biblioteca;
import udla.gtomas.Prueba.bilioteca.Bibliotecario;
import udla.gtomas.Prueba.bilioteca.Recurso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     /**Creacion de Objetos*/
        Biblioteca miBiblio = new Biblioteca("UDLA", "Park", "0989765432", 200);
        Bibliotecario miBibliotecario = new Bibliotecario("Juan", "B500", "tarde", 150);
        miBibliotecario.asignarBiblioteca(miBiblio);

        int opcion = 0;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Agregar Recurso");
            System.out.println("2. Ver Libros");
            System.out.println("3. Ver Revistas");
            System.out.println("4. Ver TODOS los recursos");
            System.out.println("5. Ver Info Bibliotecario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            String entradaUsuario = scanner.nextLine();
            opcion = Integer.parseInt(entradaUsuario);

            if (opcion == 1) {
                System.out.println("--- Nuevo Recurso ---");
                System.out.print("Ingrese el Tipo (1 para Libro, 2 para Revista): ");

                String entradaTipo = scanner.nextLine();
                int tipoInt = Integer.parseInt(entradaTipo);

                String tipoString = "Desconocido";

                if (tipoInt == 1) {
                    tipoString = "Libro";
                } else if (tipoInt == 2) {
                    tipoString = "Revista";
                } else {

                    tipoString = "Desconocido";
                }
                if (tipoString.equals("Desconocido")) {
                    System.out.println("Tipo no valido. Regresando al menu.");
                } else {
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();

                    System.out.print("Precio: ");
                    String entradaPrecio = scanner.nextLine();
                    double precio = Double.parseDouble(entradaPrecio);

                    Recurso nuevoRecurso = new Recurso(titulo, autor, isbn, precio, "Si", tipoString);
                    miBiblio.agregarRecurso(nuevoRecurso);
                }
            } else if (opcion == 2) {
                System.out.println("\nLista Libros");
                ArrayList<Recurso> lista = miBiblio.getListaRecursos();
                boolean encontrado = false;

                for (int i = 0; i < lista.size(); i++) {
                    Recurso recurso1 = lista.get(i);
                    if (recurso1.getTipo().equals("Libro")) {
                        System.out.println(recurso1.toString());
                        encontrado = true;
                    }
                }
                if (encontrado == false) {
                    System.out.println("No hay libros registrados.");
                }

            }else if (opcion==3){
                System.out.println("\nLista Revistas");
                ArrayList<Recurso> lista = miBiblio.getListaRecursos();
                boolean encontrado = false;

                for (int i = 0; i < lista.size(); i++) {
                    Recurso recurso2 = lista.get(i);
                    if (recurso2.getTipo().equals("Revista")) {
                        System.out.println(recurso2.toString());
                        encontrado = true;
                    }
                }
                if (encontrado == false) {
                    System.out.println("No hay revistas registrados.");
                }
            } else if (opcion == 4) {
                System.out.println("\nTODOS LOS RECURSOS");
                ArrayList<Recurso> lista = miBiblio.getListaRecursos();
                if (lista.size() > 0) {
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i).toString());
                    }
                } else {
                    System.out.println("La biblioteca esta vacia.");
                }

            }else if (opcion==5){

            }else if (opcion==6){
                System.out.println("Saliendo del programa");
            }
    }while (opcion!=6);
        scanner.close();
}
}


