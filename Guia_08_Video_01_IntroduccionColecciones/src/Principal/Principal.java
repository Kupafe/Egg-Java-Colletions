package Principal;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
       
        //Arrays
        
        System.out.println("\nARRAYS.\n");
        
        // Crear un Array
        
        String[] nombresArray = new String[5];
        
        // Colocar elementos en cada una de las posiciones del Array
        
        for (int i = 0; i < nombresArray.length; i++) {
            
            nombresArray[i] = "Chiquito "+ (i + 1) +".";
        }

        System.out.println("Mostrar Objetos.\n");

        for (String var : nombresArray) {
            
            System.out.println(var);
        }
        
        System.out.println("\n--------------------------------\n");
        
        //Colletions
        
        System.out.println("COLLECTIONS.\n");
        
        // Crear un Objeto Collections
        ArrayList<String> nombresArrayList = new ArrayList();
        
        System.out.println("Muestra la Dimension del ArrayList SIN objetos cargados.");
        System.out.println(nombresArrayList.size());
        // size --> Me devuelve la dimension del ArrayList
        
        // Anadir objetos al ArrayList
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        
        System.out.println("Muestra la Dimension del ArrayList CON objetos cargados.");
        System.out.println(nombresArrayList.size());
        
        // Eliminar un objeto cualquiera del ArrayList
        nombresArrayList.remove("Chiquito");
        
        System.out.println("Muestra la Dimension del ArrayList CON un objeto menos, ya que el mismo fue eliminado.");
        System.out.println(nombresArrayList.size());
                
        System.out.println("Maximo Valor de un Tipo de Dato Integer: "+ Integer.MAX_VALUE);
        System.out.println("Minimo Valor de un Tipo de Dato Integer: "+ Integer.MIN_VALUE);
    }
}
