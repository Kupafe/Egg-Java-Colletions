package Principal;

import Entidades.Mascota;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
        
        System.out.println("\nTRABAJAMOS CON LA CLASE MASCOTA.\n");
        
        // Creo el HashMap
        HashMap<String, Mascota> mascotas = new HashMap();
        
        // Creo objetos
        mascotas.put("1", new Mascota( "Fer", "Chiquito", "Perro"));
        mascotas.put("2", new Mascota( "Pepa", "Lola", "Gato"));
        mascotas.put("3", new Mascota( "Luna", "Pichuleta", "Perra"));
        mascotas.put("4", new Mascota( "Nina", "Gatona", "Gata"));

        // Muestro los objetos
        System.out.println("\nRECORRO LA LISTA.\n");
        for (Map.Entry<String, Mascota> aux : mascotas.entrySet()) {
            String key = aux.getKey();
            Mascota value = aux.getValue();
            
            System.out.println("Key: "+ key +" - Value: "+ value);
        }
        
        // Eliminar objetos

        System.out.println("\nELIMINO UN OBJETO Y RECORRO LA LISTA.\n");
        
        //Eliminar con valor y objeto
        mascotas.remove("1", new Mascota( "Fer", "Chiquito", "Perro"));
        
        // Muestro los objetos
        for (Map.Entry<String, Mascota> aux : mascotas.entrySet()) {
            String key = aux.getKey();
            Mascota value = aux.getValue();
            
            System.out.println("Key: "+ key +" - Value: "+ value);
        }
        
        System.out.println("\nELIMINO UN OBJETO Y RECORRO LA LISTA.\n");
        //Eliminar con valor
        mascotas.remove("3");
        
        // Muestro los objetos
        for (Map.Entry<String, Mascota> aux : mascotas.entrySet()) {
            String key = aux.getKey();
            Mascota value = aux.getValue();
            
            System.out.println("Key: "+ key +" - Value: "+ value);
        }
        
        System.out.println("\n----------------------------------------------");
        
        // Llave Integer
        
        System.out.println("\nEl Tipo de Dato de la Key es Integer.\n");
        HashMap<Integer, String> nombres = new HashMap();
        
        nombres.put(1, "Chiquito");
        nombres.put(Integer.MAX_VALUE, "Lola");

        for (Map.Entry<Integer, String> aux : nombres.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
            
            System.out.println("Key: "+ key +" - Value: "+ value);
        }
        
        System.out.println("\n---------------------------------------------\n");
        
        // Llave String
        System.out.println("El Tipo de Dato de la Key es String.\n");
        HashMap<String, String> valores = new HashMap();
        
        valores.put("1", "Chiquito");
        valores.put(String.valueOf(Long.MAX_VALUE), "Lola");

        for (Map.Entry<String, String> aux : valores.entrySet()) {
            String key = aux.getKey();
            String value = aux.getValue();
            
            System.out.println("Key: "+ key +" - Value: "+ value);
        }
        
        System.out.println("");
    }    
}
