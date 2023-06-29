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
package Entidades;

// Tendremos una clase Pelicula.
public class Pelicula {
    
    //  Con el t�tulo, director y duraci�n de la pel�cula (en horas).
    
    private String titulo;
    private String director;
    private Integer horas;
    private Integer minutos;
    private Integer minutosTotales;


    
    /*
    Implemente las clases y m�todos necesarios para esta situaci�n, teniendo en cuenta lo
    que se pide a continuaci�n:
    */

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer horas, Integer minutos, Integer minutosTotales) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
        this.minutos = minutos;
        this.minutosTotales = minutosTotales;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }
    
    public Integer getMinutosTotales() {
        return minutosTotales;
    }

    public void setMinutosTotales(Integer minutosTotales) {
        this.minutosTotales = minutosTotales;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + ", minutos=" + minutos + '}';
    }
}
