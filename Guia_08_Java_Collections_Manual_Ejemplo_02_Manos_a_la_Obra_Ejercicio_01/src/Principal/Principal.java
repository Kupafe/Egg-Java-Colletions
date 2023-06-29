/*
EJERCICIO COLECCIONES
Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
 */
package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
        
        // Lista
        
        System.out.println("\nLISTAS (List y ArrayList).\n");
        
        List<Integer> listaNumeros = new ArrayList();
            
        listaNumeros.add(1);

        listaNumeros.add(2);

        listaNumeros.add(3);

        listaNumeros.add(4);

        listaNumeros.add(5);
        
        System.out.println("Mostrar el LISTADO de "+ listaNumeros.size() +" numeros.\n");

        for(Integer var : listaNumeros){
            
            System.out.print(var +" ");
        }
        
        System.out.println("\n\n--------------------------------\n");
        
        // Conjuntos
        
        System.out.println("CONJUNTOS (HashSet).\n");
        
        HashSet<String> listaNombres = new HashSet();
        
        listaNombres.add("Jazmin");

        listaNombres.add("Jaquelin");

        listaNombres.add("Federico");

        listaNombres.add("Dalila");

        listaNombres.add("Pablo");
        
        System.out.println("Mostrar el CONJUNTO de "+ listaNombres.size() +" numeros.\n");

        for(String var : listaNombres){
            
            System.out.println(var);
        }
        
        System.out.println("\n--------------------------------\n");
        
        // Mapas
        
        System.out.println("MAPAS - HashSet.\n");
        
        HashMap<Integer, String> listaAnimales = new HashMap();
        
        listaAnimales.put(4, "Burro");

        listaAnimales.put(1, "Elefante");

        listaAnimales.put(5, "Cebra");

        listaAnimales.put(3, "Serpiente");

        listaAnimales.put(2, "Mono");
        
        System.out.println("Mostrar el MAPA de "+ listaAnimales.size() +" numeros.\n");

        for(Map.Entry<Integer, String> entry : listaAnimales.entrySet()){
            
            System.out.println("Numero: "+ entry.getKey() +""
                    + ", Animal: "+ entry.getValue() +".");
        }
        
        System.out.println("\n--------------------------------\n");
    }
}
