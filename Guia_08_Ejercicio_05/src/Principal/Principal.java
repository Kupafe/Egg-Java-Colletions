/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
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
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las Ã± y los tilde;
        
        HashSet<String> conjuntoPaises = new HashSet();
        
        String opcion;
        
        System.out.println("\nBIENVENIDOS A LA EJECUCION DEL PROGRAMA.");
        
        /*
        Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
        usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
        conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
        si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
        los servicios en la clase correspondiente)
        */
        
        do{
            
            System.out.print("\nIngrese el Nombre de un Pais: ");
            conjuntoPaises.add(leer.next());
                                    
            System.out.print("¿Desea ingresar otro Nombre de Pais?\n"
                    + "\n\tS (Si) / N (No).\n"
                    + "\nElija opcion: ");
            opcion = leer.next();
            
            
        }while(!opcion.equalsIgnoreCase("N"));
        
        System.out.println("\nMOSTRAR EL NOMBRE DE TODOS LOS PAISES DEL CONJUNTO.\n");
        
        for (String aux : conjuntoPaises) {
                        
            System.out.println(aux);
        }
        
        /*
        Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
        cómo se ordena un conjunto.
        
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
        Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
        buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
        usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
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
