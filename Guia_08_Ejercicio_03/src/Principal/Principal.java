/*
Crear una clase llamada Alumno que mantenga informaci�n sobre las notas de distintos
alumnos. La clase Alumno tendr� como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la informaci�n al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despu�s de ese bucle tendremos el siguiente m�todo en el servicio de Alumno:
M�todo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si est� en la lista, se llama al m�todo. Dentro
del m�todo se usar� la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el m�todo y mostrado en el main.

Pueden encontrar un ejemplo de Colecci�n como Atributo en tu Aula
Virtual.
 */
package Principal;

import Servicios.AlumnoServicio;

public class Principal {

    public static void main(String[] args) {
        
        AlumnoServicio as = new AlumnoServicio();
        
        System.out.println("\nCOMIENZO DE LA EJECUCION DEL PROGRAMA.");
        
        as.menu();
        
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
    
}
