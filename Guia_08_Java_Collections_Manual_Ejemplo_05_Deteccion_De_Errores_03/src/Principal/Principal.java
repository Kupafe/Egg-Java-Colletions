package Principal;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        
        /*
        MANOS A LA OBRA - DETECCIÓN DE ERRORES
        
        ArrayList<String> = new ArrayList()
        
        bebidas.put(?café);
        bebidas.add(?té?);
        
        Iterator<String> it =bebidas.iterator();
        
        whale (it.next()){
        
        if (it.next().equals(?café?)){
            
            it.remove();
        }
        */
        
        ArrayList<String> bebidas = new ArrayList();
        
        bebidas.add("café");
        bebidas.add("té");
        
        System.out.println("\nListado de bebidas.\n");
        
        for (String aux : bebidas) {
            
            System.out.println(aux);
        }
        
        Iterator<String> it = bebidas.iterator();
        
        while (it.hasNext()){
            
            if (it.next().equals("café")){
                
                it.remove();
            }
        }
        System.out.println("\nListado de bebidas.\n");
        
        for (String aux : bebidas) {
            
            System.out.println(aux);
        }
    }
}