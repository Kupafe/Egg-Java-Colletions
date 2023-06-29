package Principal;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        
        /*
        MANOS A LA OBRA - DETECCI�N DE ERRORES
        
        ArrayList<String> = new ArrayList()
        
        bebidas.put(?caf�);
        bebidas.add(?t�?);
        
        Iterator<String> it =bebidas.iterator();
        
        whale (it.next()){
        
        if (it.next().equals(?caf�?)){
            
            it.remove();
        }
        */
        
        ArrayList<String> bebidas = new ArrayList();
        
        bebidas.add("caf�");
        bebidas.add("t�");
        
        System.out.println("\nListado de bebidas.\n");
        
        for (String aux : bebidas) {
            
            System.out.println(aux);
        }
        
        Iterator<String> it = bebidas.iterator();
        
        while (it.hasNext()){
            
            if (it.next().equals("caf�")){
                
                it.remove();
            }
        }
        System.out.println("\nListado de bebidas.\n");
        
        for (String aux : bebidas) {
            
            System.out.println(aux);
        }
    }
}