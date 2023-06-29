package Principal;

import Servicios.ServicioMascota;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        ServicioMascota sm = new ServicioMascota();
        
        System.out.println("\nCrea las mascotas.\n");
        
       sm.fabricaMascota(1);
       sm.mostrarMascotas();
       
       System.out.println("\n--------------------------------------------\n");
       
       System.out.println("Actualiza una mascota.");
       
       sm.actualizarMascota(0);
       sm.mostrarMascotas();
       
       System.out.println("\n--------------------------------------------\n");
       
       System.out.println("\nElimina una mascota.\n");
       
       sm.eliminarMascota(3);
       sm.mostrarMascotas();
       
       System.out.println("\n--------------------------------------------\n"
               + "\n--------------------------------------------\n\n"
               + "OTRAS FUNCIONALIDADES DE LOS ARRAYS.");
       
       String[] nombres = {"Pepe", "Pepa"};
       
       List<String> listaNombres1 = new ArrayList(Arrays.asList(nombres)); 
       // Arrays.AsList(nombres) --> Convierte el Vector en un ArrayList o List
       
       List<String> listaNombres2 = new ArrayList();
       listaNombres2.addAll(listaNombres1);
       // listaNombres2.addAll(listaNombres1) --> Copia de manera masiva, no de uno en uno
       
       List<String> listaNombres3 = new ArrayList();
       listaNombres3.addAll(0, listaNombres1);
       // listaNombres3.addAll(0, listaNombres1); --> Tambien se le puede poner un indice para acomodar el nombre en la posicion que uno quiere
    }
    
}
