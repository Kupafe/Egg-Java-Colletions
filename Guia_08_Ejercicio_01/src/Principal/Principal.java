/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Principal;

import java.util.ArrayList;
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
    
        System.out.println("\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
}

/*
        Chihuahua
	Boxer
	Salchicha
	Caniche
*/