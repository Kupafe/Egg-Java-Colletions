package Principal;

import Entidades.Mascota;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {

        // Creo el ArrayList
        ArrayList<Mascota> mascotas = new ArrayList();
        
        // Agrego las mascotas al ArrayList
        mascotas.add(new Mascota( "Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota( "Pepa", "Lola", "Gato"));
        
        System.out.println("\nLISTADO DE MASCOTAS.\n");
        
        for (Mascota mascota : mascotas) {
            
            System.out.println(mascota);
        }
        
        System.out.println("\nLISTADO DE MASCOTAS ORDENADO.\n");
        
        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        
        for (Mascota mascota : mascotas) {
            
            System.out.println(mascota);
        }
        
        // Agrego mas mascotas al ArrayList para que se vea como se desordena la Lista
        
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
        
        
        System.out.println("\nLISTADO DE MASCOTAS DESORDENADO DE MANERA ALEATORIA.\n");
        Collections.shuffle(mascotas);
        
        for (Mascota mascota : mascotas) {
            
            System.out.println(mascota);
        }
    }
    
}
