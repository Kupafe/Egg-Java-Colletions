package Principal;

import Servicios.ServicioMascota;


public class Principal {

    public static void main(String[] args) {
        
        ServicioMascota sm = new ServicioMascota();
        
        System.out.println("\nCREAR MASCOTA.\n");
        sm.fabricaMascota(2);
        
        System.out.println("\nMOSTRAR MASCOTA.\n");
        sm.mostrarMascotas();
        
        System.out.println("\n-------------------------------------------\n");
        
        System.out.println("\nELIMINAR MASCOTA.\n");
        sm.eliminarMascotaPorNombre("Lola");
        
        System.out.println("\nMOSTRAR MASCOTA.\n");
        sm.mostrarMascotas();
        
        System.out.println("\n-------------------------------------------\n");
        
        System.out.println("\nACTUALIZAR MASCOTA.\n");
        sm.actualizarMascotaPorNombre("Lola", "Nina");
        
        System.out.println("\nMOSTRAR MASCOTA.\n");
        sm.mostrarMascotas();
        
        /*
        // Crear una Lista
        List<String> nombres = new ArrayList();
        
        //Cargar una Lista
        nombres.add("Lola");
        nombres.add("Rodman");
        nombres.add("Chiquito");
        
        //Diferentes maneras de recorrer una Lista
        
        // For Each
        
        System.out.println("\nRecorro la lista con ForEach (Solo sirve para mostrar).\n");
        
        for (String aux : nombres) {
            
            System.out.println(aux);
        }
        
        System.out.println("\nRecorro la lista con For i (Solo sirve para mostrar).\n"
                + "Modificando el indice, puedo hacer que la Lista se muestre de atras hacia adelante");
        
        System.out.println("Se muestra la Lista con un For i.");
        
        for (int i = 0; i < nombres.size(); i++) {
            
            System.out.println(nombres.get(i));
        }
        
        System.out.println("\nOtra manera de recorrer la lista con ForEach (Solo sirve para mostrar).\n");
        
        nombres.forEach((e)->System.out.println(e));
        
        //-----------------------------------------
        
        System.out.println("Ahora vamos a recorrer y eliminar elementos de la Lista.");
        
        for (int i = 0; i < nombres.size(); i++) {
            
            String m = nombres.get(i);
            
            if(m.equals("Lola")){
                
                nombres.remove(m);
            }
        }
        
        System.out.println("Se muestra la Lista con el elemento Lola eliminado.");
        
        nombres.forEach((e)->System.out.println(e));

        // Agrego mas aniamles a la lista
        nombres.add("Luna");
        nombres.add("Nina");
        
        System.out.println("Iterator. Otra manera de recorrer las listas.");
    
        Iterator<String> it = nombres.iterator();
        
        while (it.hasNext()) { // Segundo --> Salta al siguiente objeto. HasNext --> Corrobora que existe el objeto
            
            String aux = it.next(); // Primero --> Tomo el objeto
            
            System.out.println(aux);
        }
        
        System.out.println("Iterator. Eliminar un objeto de la lista.");
        
        Iterator<String> ite = nombres.iterator();
        
        while (ite.hasNext()) { // Segundo --> Salta al siguiente objeto. HasNext --> Corrobora que existe el objeto
            
            String aux = ite.next(); // Primero --> Tomo el objeto
            
            if(aux.equals("Chiquito")){
                
                ite.remove();
            }
        }
        
        nombres.forEach((e)->System.out.println(e));
    
        */
    }
    
}
