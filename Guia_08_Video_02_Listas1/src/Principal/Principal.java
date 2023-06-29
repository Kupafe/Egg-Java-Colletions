package Principal;

import Servicios.ServicioMascota;

public class Principal {

    public static void main(String[] args) {
       
        ServicioMascota sm = new ServicioMascota();
        
        sm.crearMascota();
        sm.crearMascota();
        
        sm.mostrarMascotas();
        
    }
}
