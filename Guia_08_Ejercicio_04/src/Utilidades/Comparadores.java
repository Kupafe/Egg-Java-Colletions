/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
    - Mostrar en pantalla todas las películas.
    - Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    - Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
      pantalla.
    - Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
      pantalla.
    - Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    - Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
    /*
    - Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
      pantalla.
    */
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() { // Recorre del infinito al cero
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o2.getMinutosTotales().compareTo(o1.getMinutosTotales()); // Comparo
        }
    };
    
    /*
    - Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
      pantalla.
    */
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>() { // Recorre del cero al infinito
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o1.getMinutosTotales().compareTo(o2.getMinutosTotales()); // Comparo
        }
    };
    
    /*
    - Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    */
    public static Comparator<Pelicula> ordenarPorTituloAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o1.getTitulo().compareTo(o2.getTitulo()); // Comparo
        }
    };
    
    /*
    - Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    */
    public static Comparator<Pelicula> ordenarPorDirectorAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o1.getDirector().compareTo(o2.getDirector()); // Comparo
        }
    };
}
