/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.

Pueden encontrar un ejemplo de Colección como Atributo en tu Aula
Virtual.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las Ã± y los tilde;
        
    Alumno a = new Alumno();
        
    List<Alumno> listaAlumnos = new ArrayList();
    
    Double[] vectorNota = new Double[3];
    
    String nombre, opcion;
    
    Double nota;
        
    /*
    En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
    toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    pregunta al usuario si quiere crear otro Alumno o no.
    */
    public void crearAlumno(){
        
        ArrayList<Double> listaNotas = new ArrayList();
        
        do{
        
            System.out.print("Ingrese el nombre del alumno: ");
            nombre = leer.next();
            
            do{
            
                System.out.print("Ingrese la Primer Nota del alumno "+ nombre +".\n"
                        + "La puntuacion es del 1 al 10.\n"
                        + "Ingrese la Nota: ");
                nota = leer.nextDouble();
            
            }while(nota <= 0 | nota > 10);
            
            listaNotas.add(nota);
            
            do{
            
                System.out.print("Ingrese la Segunda Nota del alumno "+ nombre +".\n"
                        + "La puntuacion es del 1 al 10.\n"
                        + "Ingrese la Nota: ");
                nota = leer.nextDouble();
            
            }while(nota <= 0 | nota > 10);
            
            listaNotas.add(nota);
            
            do{
            
                System.out.print("Ingrese la Tercer Nota del alumno "+ nombre +".\n"
                        + "La puntuacion es del 1 al 10.\n"
                        + "Ingrese la Nota: ");
                nota = leer.nextDouble();
            
            }while(nota <= 0 | nota > 10);
            
            listaNotas.add(nota);

            Alumno a = new Alumno(nombre, listaNotas);
            
            listaAlumnos.add(a);
            
            System.out.print("¿Desea ingresar otro Alumno?\n"
                    + "\n\tS (Si) / N (No).\n"
                    + "\nElija opcion: ");
            opcion = leer.next();
            
        }while(!opcion.equalsIgnoreCase("N"));
    }
    
    /*
    Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    promedio final, devuelto por el método y mostrado en el main.

    Pueden encontrar un ejemplo de Colección como Atributo en tu Aula
    Virtual.
 ``*/
    public void notaFinal(){
        
        Integer posicion;
        Double nota1, nota2, nota3, promedio;
        
        do{
            
            posicion = buscarAlumno();
            
            if(listaAlumnos.get(posicion).getNombre().equalsIgnoreCase(nombre)){
                
                nota1 = listaAlumnos.get(posicion).getVectorNotas().get(0);
                nota2 = listaAlumnos.get(posicion).getVectorNotas().get(1);
                nota3 = listaAlumnos.get(posicion).getVectorNotas().get(2);
                
                promedio = (nota1 + nota2 + nota3) / 3;
            
                System.out.println("El Promedio de la Nota Final del Alumno "+ nombre +" es de "+ promedio +" puntos.");
                
            } else {
           
                System.out.println("No se encontro al alumno "+ nombre +"dentro del Listado.");
            }

            System.out.print("¿Desea ver la nota de otro Alumno?\n"
                    + "\n\tS (Si) / N (No).\n"
                    + "\nElija opcion: ");
            opcion = leer.next();
            
        }while(!opcion.equalsIgnoreCase("N"));
    }
    
    public Integer buscarAlumno(){
        
        Alumno alumnoAux = new Alumno();
        
        int indice = 0;
        
        System.out.print("Ingrese el nombre del Alumno del cual quiere saber su Nota Final: ");
        nombre = leer.next();
        
        for (int i = 0; i < listaAlumnos.size();i++) {
                
            alumnoAux = listaAlumnos.get(i);
            
            if (alumnoAux.getNombre().equalsIgnoreCase(nombre)) {
                    
                indice = i;
            }
        }
        
        return indice;
    }

    public void menu(){
    
        String opcion;
        
        do{
            
            System.out.print("\n--- MENU. ---\n"
                    + "\n\t1 - Crear Alumno/s.\n"
                    + "\t2 - Calcular Nota Final.\n"
                    + "\n\t0 - Salir.\n"
                    + "\nIngresar opcion: ");
            opcion = leer.next();
            
            switch(opcion){
                
                case "1":
                    
                    crearAlumno();
                    
                    break;
                    
                case "2":
                    
                    notaFinal();
                    break;
                    
                case "0":
                    System.out.println("Saliendo ...");
                    break;
                    
                default:

                    System.out.println("\nError. Mal Ingresada la opcion.\n");
                    break;
            }
            
        }while(!opcion.equals("0"));
    }
}
