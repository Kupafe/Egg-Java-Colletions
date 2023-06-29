/*
EJERCICIO LISTA LIBROS
¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Servicios;

import Entidades.Libro;
import java.util.ArrayList;
import java.util.Scanner;


public class LibroServicio {
    
    private Scanner leer;
    
    private ArrayList<Libro> arrayLibros; // Creo la lista
    
    //Esta es una muy buena practica
    public LibroServicio() {
        
        this.arrayLibros = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    public void crearLibro(){

        System.out.print("Ingrese el Numero de ISBN: ");
        Long numeroISBN = leer.nextLong();
        
        System.out.print("Ingrese el Titulo: ");
        String nombreTitulo = leer.next().toUpperCase();
        
        System.out.print("Ingrese el Autor: ");
        String nombreAutor = leer.next().toUpperCase();
        
        System.out.print("Ingrese la cantidad de Paginas: ");
        Integer numerosPaginas = leer.nextInt();
        
        arrayLibros.add(new Libro(0, nombreTitulo, nombreAutor, 0));
    }
    
    public void mostrarLista() {
        
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones      
        for (Libro aux : arrayLibros) {
            
            System.out.println(arrayLibros.toString());      
        }
    } 

    public void menu(){

        String opcion;
        
        do{

            System.out.print("\nMENU.\n\n"
                    + "\t1 - Crear Libro.\n"
                    + "\t2 - Mostrar la Lista de Libros.\n"
                    + "\t0 - Salir.\n"
                    + "\nElija opcion: ");
            opcion = leer.next();

            switch(opcion){

                case "1":
                    
                    crearLibro();
                    
                    break;

                case "2":

                    mostrarLista();
                    
                    break;


                case "0":
                    System.out.println("Saliendo ...");
                   
                    break;
            }
        }
        
        while(!opcion.equals("0"));
    }
}
