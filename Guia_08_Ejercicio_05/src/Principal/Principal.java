/*
Se requiere un programa que lea y guarde pa�ses, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedir� un pa�s en un bucle, se guardar� el pa�s en el
conjunto y despu�s se le preguntar� al usuario si quiere guardar otro pa�s o si quiere salir,
si decide salir, se mostrar� todos los pa�ses guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Despu�s deberemos mostrar el conjunto ordenado alfab�ticamente: para esto recordar
c�mo se ordena un conjunto.
Por �ltimo, al usuario se le pedir� un pa�s y se recorrer� el conjunto con un Iterator, se
buscar� el pa�s en el conjunto y si est� en el conjunto se eliminar� el pa�s que ingres� el
usuario y se mostrar� el conjunto. Si el pa�s no se encuentra en el conjunto se le informar�
al usuario.
 */
package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde;
        
        HashSet<String> conjuntoPaises = new HashSet();
        
        String opcion;
        
        System.out.println("\nBIENVENIDOS A LA EJECUCION DEL PROGRAMA.");
        
        /*
        Se requiere un programa que lea y guarde pa�ses, y para evitar que se ingresen repetidos
        usaremos un conjunto. El programa pedir� un pa�s en un bucle, se guardar� el pa�s en el
        conjunto y despu�s se le preguntar� al usuario si quiere guardar otro pa�s o si quiere salir,
        si decide salir, se mostrar� todos los pa�ses guardados en el conjunto. (Recordemos hacer
        los servicios en la clase correspondiente)
        */
        
        do{
            
            System.out.print("\nIngrese el Nombre de un Pais: ");
            conjuntoPaises.add(leer.next());
                                    
            System.out.print("�Desea ingresar otro Nombre de Pais?\n"
                    + "\n\tS (Si) / N (No).\n"
                    + "\nElija opcion: ");
            opcion = leer.next();
            
            
        }while(!opcion.equalsIgnoreCase("N"));
        
        System.out.println("\nMOSTRAR EL NOMBRE DE TODOS LOS PAISES DEL CONJUNTO.\n");
        
        for (String aux : conjuntoPaises) {
                        
            System.out.println(aux);
        }
        
        /*
        Despu�s deberemos mostrar el conjunto ordenado alfab�ticamente: para esto recordar
        c�mo se ordena un conjunto.
        
        Ordenar un Conjunto
        
            HashSet<Integer> numerosSet = new HashSet();
            // Se convierte el HashSet a Lista
            ArrayList<Integer> numerosLista = new ArrayList(numerosSet);
            Collections.sort(numerosLista);
        */
        
        ArrayList<String> listaPaises = new ArrayList(conjuntoPaises);
        Collections.sort(listaPaises);
        
        System.out.println("\nMOSTRAR EL NOMBRE DE TODOS LOS PAISES DEL CONJUNTO ALFABETICAMENTE.\n");
        
        for (String aux : listaPaises) {
                        
            System.out.println(aux);
        }
        
        /*
        Por �ltimo, al usuario se le pedir� un pa�s y se recorrer� el conjunto con un Iterator, se
        buscar� el pa�s en el conjunto y si est� en el conjunto se eliminar� el pa�s que ingres� el
        usuario y se mostrar� el conjunto. Si el pa�s no se encuentra en el conjunto se le informar�
        al usuario.
        */
        Boolean encontro = false;
        
        System.out.print("\nIngrese un nombre de pais para buscar dentro del conjunto para ser eliminado: ");
        String paisABuscar = leer.next();
        
        Iterator<String> it = conjuntoPaises.iterator();

        while (it.hasNext()){

            if (it.next().equals(paisABuscar)){

                it.remove();
                System.out.println("\nEl Pais "+ paisABuscar +" se Elimino del Conjunto.");
                encontro = true;
            }
        }
        
        if (encontro == false){
            
            System.out.println("\nEl Pais "+ paisABuscar +" no se Elimino del Conjunto, ya que el mismo no se encontro.");
        }
            
        System.out.println("\nMOSTRAR EL NOMBRE DE TODOS LOS PAISES DEL CONJUNTO.\n");
        
        for (String aux : conjuntoPaises) {
                        
            System.out.println(aux);
        }

        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
    
    /*
    Nombres de paises
        Uruguay
        Brazil
        Argentina
        Peru
        Paraguay
        Bolivia
        Ecuador
        Venezuela
        Colombia
    */
    
    
}
