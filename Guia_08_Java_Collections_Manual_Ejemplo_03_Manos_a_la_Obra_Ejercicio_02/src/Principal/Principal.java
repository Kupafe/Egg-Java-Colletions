/*
MANOS A LA OBRA
Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
cada forma que aprendiste arriba.

Ejercicio anterior.

EJERCICIO COLECCIONES
Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
 */
package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Principal {

    public static void main(String[] args) {
        
        // Lista
        
        System.out.println("\nLISTAS (List y ArrayList).\n");
        
        List<Integer> listaNumeros = new ArrayList();
            
        listaNumeros.add(5);

        listaNumeros.add(2);

        listaNumeros.add(1);

        listaNumeros.add(4);

        listaNumeros.add(3);
        
        System.out.println("Mostrar el LISTADO de "+ listaNumeros.size() +" numeros.\n");

        for(Integer var : listaNumeros){
            
            System.out.print(var +" ");
        }
        
        System.out.println("\n\nEliminar un objeto de la Lista.\n");
        listaNumeros.remove(3);
        
        for(Integer var : listaNumeros){
            
            System.out.print(var +" ");
        }
        
        System.out.println("\n\nLista Ordenada.\n");

        Collections.sort(listaNumeros);
        
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
        
        System.out.println("\nEliminar un objeto del Conjunto.\n");
        listaNombres.remove("Dalila");
        
        for(String var : listaNombres){
            
            System.out.println(var +" ");
        }
        
        System.out.println("\nConjunto Ordenado.\n");
        
        // Se convierte el HashSet a Lista
        
        ArrayList<String> arrayNombres = new ArrayList(listaNombres);
        Collections.sort(arrayNombres);
        
        for(String var : arrayNombres){
            
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
        
        System.out.println("\nEliminar un objeto del Mapa.\n");
        listaAnimales.remove(1);
        
        for(Map.Entry<Integer, String> entry : listaAnimales.entrySet()){
            
            System.out.println("Numero: "+ entry.getKey() +""
                    + ", Animal: "+ entry.getValue() +".");
        }
        
          
        
        System.out.println("\nMapa Ordenado por Numero.\n");
        
        // Se convierte el HashMap a TreeMap
        
        TreeMap<Integer, String> treeAnimales = new TreeMap(listaAnimales);

        for(Map.Entry<Integer, String> entry : treeAnimales.entrySet()){
            
            System.out.println("Numero: "+ entry.getKey() +""
                    + ", Animal: "+ entry.getValue() +".");
        }

        System.out.println("\n--------------------------------\n");
    }
}