package Principal;

import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {

        /*
        MANOS A LA OBRA ? DETECCIÓN DE ERRORES
        HashMap<Integer> personas = new HashMap<>;
        String n1 = "Albus";
        String n2 = "Severus";
        personas.add(n1);
        personas.add(n2);
        */
        
        HashMap<Integer,String> personas = new HashMap();
        
        int dni1 = 33258471;
        String n1 = "Albus";
        int dni2 = 47895623;
        String n2 = "Severus";
        
        personas.put(dni1, n1);
        personas.put(dni2, n2);
        
        for(Map.Entry<Integer, String> entry : personas.entrySet()){
            
            System.out.println("Numero: "+ entry.getKey() +""
                    + ", Persona: "+ entry.getValue() +".");
        }
        
        System.out.println("\n--------------------------------\n");
    }
}