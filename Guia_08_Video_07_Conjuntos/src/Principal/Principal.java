package Principal;

import Entidades.Mascota;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
       
        
        // Creo el HashSet para un String
        HashSet<String> nombres = new HashSet();
        
        // Los Conjuntos no soportan elementos duplicados
        nombres.add("Chiquito");
        nombres.add("Chiquito");
        nombres.add("Chiquito");
        
        System.out.println("\nLISTADO DE NOMBRES.\n");
        
        for (String aux : nombres) {
            
            System.out.println(aux);
        }
        
        System.out.println("\n----------------------------------------------");
        
        // Creo el  TreeSet para un String
        TreeSet<String> animales = new TreeSet();
        
        // Los Conjuntos no soportan elementos duplicados
        animales.add("Jirafa");
        animales.add("Jirafa");
        animales.add("Jirafa");
        
        System.out.println("\nLISTADO DE ANIMALES.\n");
        
        for (String aux : animales) {
            
            System.out.println(aux);
        }
        
        System.out.println("\n----------------------------------------------");
        
        // Creo el Mapa para un objeto
        Set<Mascota> mascotas = new HashSet();
        
        // Agrego mascotas al HashMap
        
        mascotas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota( "Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota( "Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota( "Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota( "Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota( "Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota( "Pepa", "Lola", "Gato"));
        
        System.out.println("\nLISTADO DE MASCOTAS.\n");
        
        for (Mascota mascota : mascotas) {
            
            System.out.println(mascota);
        }
        
        System.out.println("\n----------------------------------------------");
        
        // Creo el Mapa para un objeto
        TreeSet<Mascota> mascotasDomesticas = new TreeSet();
        
        // Agrego mascotas al HashMap
        
        mascotasDomesticas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotasDomesticas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotasDomesticas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotasDomesticas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotasDomesticas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotasDomesticas.add(new Mascota( "Fer", "Chiquito", "Perro"));

        mascotasDomesticas.add(new Mascota( "Pepa", "Lola", "Gato"));
        mascotasDomesticas.add(new Mascota( "Pepa", "Lola", "Gato"));
        mascotasDomesticas.add(new Mascota( "Pepa", "Lola", "Gato"));
        mascotasDomesticas.add(new Mascota( "Pepa", "Lola", "Gato"));
        mascotasDomesticas.add(new Mascota( "Pepa", "Lola", "Gato"));
        mascotasDomesticas.add(new Mascota( "Pepa", "Lola", "Gato"));
        
        mascotasDomesticas.add(new Mascota( "Luna", "Pichuleta", "Perra"));
        mascotasDomesticas.add(new Mascota( "Luna", "Pichuleta", "Perra"));
        mascotasDomesticas.add(new Mascota( "Luna", "Pichuleta", "Perra"));
        mascotasDomesticas.add(new Mascota( "Luna", "Pichuleta", "Perra"));
        mascotasDomesticas.add(new Mascota( "Luna", "Pichuleta", "Perra"));
        mascotasDomesticas.add(new Mascota( "Luna", "Pichuleta", "Perra"));
        
        System.out.println("\nLISTADO DE MASCOTAS.\n");
        
        for (Mascota mascota : mascotasDomesticas) {
            
            System.out.println(mascota);
        }
    
    }
    
}
