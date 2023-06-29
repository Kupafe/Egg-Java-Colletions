package Principal;

import Servicios.ServicioMascota;

public class Principal {

    public static void main(String[] args) {
        
        ServicioMascota sm = new ServicioMascota();
        
        // Crea las mascotas de forma automatica
        
        sm.fabricaChiquitos(140);
        
        sm.mostrarMascotas();
        
        System.out.println("---------------------------------------------");
        
        // Crea las mascotas de forma manual
        
        sm.fabricaMascota(2);
        
        sm.mostrarMascotas();
    }
    
}
