/*
EJERCICIO LISTA LIBROS
¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Principal;

import Servicios.LibroServicio;

public class Principal {

    public static void main(String[] args) {

        LibroServicio ls = new LibroServicio();
        
        System.out.println("\nBIENVENIDO AL SISTEMA DE BIBLIOTECA.");
        
        ls.menu();
        
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
}
