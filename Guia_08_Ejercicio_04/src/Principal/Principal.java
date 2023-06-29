/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el t�tulo, director y duraci�n de la pel�cula (en horas).
Implemente las clases y m�todos necesarios para esta situaci�n, teniendo en cuenta lo
que se pide a continuaci�n:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidi�ndole al usuario
todos sus datos y guard�ndolos en el objeto Pelicula.
Despu�s, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Despu�s de ese bucle realizaremos las siguientes acciones:
    - Mostrar en pantalla todas las pel�culas.
    - Mostrar en pantalla todas las pel�culas con una duraci�n mayor a 1 hora.
    - Ordenar las pel�culas de acuerdo a su duraci�n (de mayor a menor) y mostrarlo en
      pantalla.
    - Ordenar las pel�culas de acuerdo a su duraci�n (de menor a mayor) y mostrarlo en
      pantalla.
    - Ordenar las pel�culas por t�tulo, alfab�ticamente y mostrarlo en pantalla.
    - Ordenar las pel�culas por director, alfab�ticamente y mostrarlo en pantalla.
 */
package Principal;

import Servicios.PeliculaServicio;

public class Principal {

    public static void main(String[] args) {
        
        PeliculaServicio ps = new PeliculaServicio();
        
        System.out.println("\nCOMIENZO DE LA EJECUCION DEL PROGRAMA.");
        
        ps.menu();
        
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
}
