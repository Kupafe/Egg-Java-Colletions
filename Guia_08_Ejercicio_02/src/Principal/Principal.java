/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.

Ejercicio anterior

Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las Ã± y los tilde;
        
        List<String> listaPerros = new ArrayList();
        
        String razaPerro, opcion;
        
        System.out.println("\nBIENVENIDOS A LA EJECUCION DEL PROGRAMA.\n");
        
        do{
            
            System.out.print("Ingrese una raza de Perros: ");
            razaPerro = leer.next();
            
            listaPerros.add(razaPerro);
            
            System.out.print("¿Desea ingresar otra Raza de Perro?\n"
                    + "\n\tS (Si) / N (No).\n"
                    + "\nElija opcion: ");
            opcion = leer.next();
            
        }while(!opcion.equalsIgnoreCase("N"));
        
        System.out.println("\nMOSTRAR EL LISTADO DE TODAS LAS RAZAS DE PERROS DE LA LISTA.\n");
        
        for (String aux : listaPerros) {
            
            System.out.println("\t"+ aux);
        }
        
        /*
        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
        un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
        la lista ordenada.
        */
        
        Boolean encontro = false;
        
        System.out.print("\nIngrese el nombre de la raza a buscar y eliminar: ");
        String raza = leer.next();
        
        // Iterator
        
        Iterator<String> it = listaPerros.iterator();
        
        while (it.hasNext()) { // Segundo --> Salta al siguiente objeto. HasNext --> Corrobora que existe el objeto
            
            String aux = it.next(); // Primero --> Tomo el objeto
            
            if(aux.equals(raza)){
                
                it.remove();
                encontro = true;
            }
        }
        
        if (encontro){
            
            System.out.println("\nSI se encontro la raza "+ raza +" dentro de la lista y se elimino.\n");
            
        }else{
            
            System.out.println("\nNO se encontro la raza "+ raza +" dentro de la lista.\n");
            Collections.sort(listaPerros);
        }
        
        // Recorrer la lista
        
        System.out.println("\nMOSTRAR EL LISTADO DE TODAS LAS RAZAS DE PERROS DE LA LISTA.\n");
        listaPerros.forEach((e)->System.out.println(e));
        
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
}

/*
    Raza de Perros

        Chihuahua
	Boxer
	Salchicha
	Caniche
        Labrador
        Gran Danes
        San Bernardo
        Dalmata
*/