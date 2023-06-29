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
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicio {
    
    
    private Scanner leer;
    
    private ArrayList<Pelicula> listaPeliculas; // Creo la lista
    
    //Esta es una muy buena practica
    public PeliculaServicio() {
        
        this.listaPeliculas = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
       
    /* 
    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    todos sus datos y guardándolos en el objeto Pelicula.
    Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
    crear otra Pelicula o no.
    */
    public void crearPelicula(){
        
        String titulo, director, opcion;
        Integer horas, minutos, minutosTotales;
        
        do{
            
            System.out.print("Ingrese el Titulo de la Pelicula: ");
            titulo = leer.next();
            
            
            System.out.print("Ingrese el Nombre del Director de la Pelicula "+ titulo +": ");
            director = leer.next();
            
            do{
            
                System.out.print("Ingrese la Duracion en Minutos de la Pelicula "+ titulo +": ");
                minutosTotales = leer.nextInt();
                
            }while(minutosTotales < 0);
            
            horas = minutosTotales / 60;
            minutos = minutosTotales % 60;
            
            listaPeliculas.add(new Pelicula(titulo, director, horas, minutos, minutosTotales));
            
            System.out.println("La Pelicula "+ titulo +" cuyo Director es "+ director +", la misma tiene una duracion de "+ horas +" Hora/s y "+ minutos +" minuto/s.");
            
            System.out.print("¿Desea ingresar otra Pelicula?\n"
                    + "\n\tS (Si) / N (No).\n"
                    + "\nElija opcion: ");
            opcion = leer.next();
            
        }while(!opcion.equalsIgnoreCase("N"));
        
        
    }
    // Después de ese bucle realizaremos las siguientes acciones:

    // - Mostrar en pantalla todas las películas.
    public void mostrarPeliculas() {
        
        System.out.println("\nLISTA DE PELICULAS.\n");
    
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones      

        for (Pelicula aux : listaPeliculas) {

            System.out.println(aux.toString());
        }
    }
    
    // - Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void peliculasMayoresAUnaHora(){
        
        Boolean esta = false;
        
        for (int i = 0; i < listaPeliculas.size(); i++) {
            
            if(listaPeliculas.get(i).getMinutosTotales() > 60){
                
                esta = true;
                // System.out.println(listaPeliculas.toString() +"\n");
                System.out.println(listaPeliculas.get(i).toString());;
            }
        }
        
        if (esta == false){
            
            System.out.println("\nNo hay peliculas mayores a 1 Hora dentro de la lista.");
        }
    }
        
    /*
    - Ordenar las películas de acuerdo a su duración (de mayor a menor) y
      mostrarlo en pantalla.
    */
    public void ordenarPorDuracionDeMayorAMenor(){
        
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDuracionDesc);
        
        mostrarPeliculas();
    }
    
    /*
    - Ordenar las películas de acuerdo a su duración (de menor a mayor) y
      mostrarlo en pantalla.
    */
    public void ordenarPorDuracionDeMenorAMayor(){
        
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDuracionAsc);
        
        mostrarPeliculas();
    }
    
    /*
    - Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    */
    public void ordenarPorTituloAlfabeticamente(){
        
        Collections.sort(listaPeliculas, Comparadores.ordenarPorTituloAlfabeticamente);
        
        mostrarPeliculas();
    }
    
    /*
    - Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    */
    public void ordenarPorDirectorAlfabeticamente(){
        
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDirectorAlfabeticamente);
        
        mostrarPeliculas();
    }
    
    public void menu(){
    
        String opcion;
        
        do{
            
            System.out.print("\n--- MENU. ---\n"
                    + "\n\t1 - Crear Pelicula/s.\n"
                    + "\t2 - Mostrar todas las Peliculas.\n"
                    + "\t3 - Mostrar las Peliculas Mayores a 1 Hora.\n"
                    + "\t4 - Ordenar las películas de acuerdo a su duración (de mayor a menor).\n"
                    + "\t5 - Ordenar las películas de acuerdo a su duración (de menor a mayor).\n"
                    + "\t6 - Ordenar las películas por título, alfabéticamente.\n"
                    + "\t7 - Ordenar las películas por director, alfabéticamente.\n"
                    + "\n\t0 - Salir.\n"
                    + "\nIngresar opcion: ");
            opcion = leer.next();
            
            switch(opcion){
                
                case "1":
                    
                    crearPelicula();
                    
                    break;
                    
                case "2":
                    
                    mostrarPeliculas();
                    break;
                    
                case "3":
                    
                    peliculasMayoresAUnaHora();
                    break;
                    
                case "4":
                    
                    ordenarPorDuracionDeMayorAMenor();
                    break;
                    
                case "5":
                    
                    ordenarPorDuracionDeMenorAMayor();
                    break;
                    
                case "6":
  
                    ordenarPorTituloAlfabeticamente();
                    break;
                    
                case "7":
                    
                    ordenarPorDirectorAlfabeticamente();
                    break;
                    
                case "0":
                    System.out.println("\nSaliendo ...");
                    break;
                    
                default:

                    System.out.println("\nError. Mal Ingresada la opcion.\n");
                    break;
            }
            
        }while(!opcion.equals("0"));
    }
}