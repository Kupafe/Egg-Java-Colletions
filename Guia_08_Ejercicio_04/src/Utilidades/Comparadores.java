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
package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
    /*
    - Ordenar las pel�culas de acuerdo a su duraci�n (de mayor a menor) y mostrarlo en
      pantalla.
    */
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() { // Recorre del infinito al cero
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o2.getMinutosTotales().compareTo(o1.getMinutosTotales()); // Comparo
        }
    };
    
    /*
    - Ordenar las pel�culas de acuerdo a su duraci�n (de menor a mayor) y mostrarlo en
      pantalla.
    */
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>() { // Recorre del cero al infinito
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o1.getMinutosTotales().compareTo(o2.getMinutosTotales()); // Comparo
        }
    };
    
    /*
    - Ordenar las pel�culas por t�tulo, alfab�ticamente y mostrarlo en pantalla.
    */
    public static Comparator<Pelicula> ordenarPorTituloAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o1.getTitulo().compareTo(o2.getTitulo()); // Comparo
        }
    };
    
    /*
    - Ordenar las pel�culas por director, alfab�ticamente y mostrarlo en pantalla.
    */
    public static Comparator<Pelicula> ordenarPorDirectorAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o1.getDirector().compareTo(o2.getDirector()); // Comparo
        }
    };
}
