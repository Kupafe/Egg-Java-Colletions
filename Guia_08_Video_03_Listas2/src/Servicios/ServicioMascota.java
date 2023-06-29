package Servicios;

import Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioMascota {
    
    private Scanner leer;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las Ã± y los tilde
        this.mascotas = new ArrayList();
    }
    
    public Mascota crearMascota(){
        
        System.out.print("Ingrese nombre: ");
        String nombre = leer.next();
        
        System.out.print("Ingrese apodo: ");
        String apodo = leer.next();
        
        System.out.print("Ingrese tipo: ");
        String tipo = leer.next();
        
        Mascota m = new Mascota(nombre, apodo, tipo);
        
        mascotas.add(m);
        
        return m;
    }
    
    public void mostrarMascotas(){
        
        System.out.println("\nLas mascotas actuales de la lista mascotas son:\n");
        
        for (Mascota aux : mascotas) {
            
            System.out.println("\t"+ aux.toString());
        }
        
        System.out.println("\nLa cantidad de mascotas de la lista son: "+ mascotas.size() +".\n");
    }
    
    /**
     * Crea mascotas TODOS chiquitos
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir
     * a la lista
     */
    public void fabricaChiquitos(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            
            mascotas.add(new Mascota("Fer", "Chiquito", "Beagle"));
        }
    }
    
    /**
     * Crea mascotas pidiendo datos por teclado
     * 
     * @param cantidad 
     */
    public void fabricaMascota(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            
            Mascota mascotaCreada = crearMascota();
                    
            System.out.println(mascotaCreada.toString());
        }
    }
}
