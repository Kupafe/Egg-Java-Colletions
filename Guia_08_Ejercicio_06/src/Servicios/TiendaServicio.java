/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
    HashMap<String, Double> mapaProductos = new HashMap();
    
    String nombreProducto;
    
    public void menu(){
        
        String opcion;
        
        do{
            
            System.out.print("\n--- MENU. ---\n"
                    + "\n\t1 - Ingresar Producto con su respectivo precio.\n"
                    + "\t2 - Modificar el precio de un Producto.\n"
                    + "\t3 - Eliminar un Producto.\n"
                    + "\t4 - Mostrar todos los Productos con surespectivos precios.\n"
                    + "\n\t0 - Salir.\n"
                    + "\nIngresar opcion: ");
            opcion = leer.next();
            
            switch(opcion){
                
                case "1":
                    
                    ingresarProducto();
                    
                    break;
                    
                case "2":
                    
                    modificarPrecioProducto();
                    break;
                    
                case "3":
                    
                    eliminarProducto();
                    break;
                    
                case "4":
                    
                    mostrarProductos();
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
    
    public void ingresarProducto(){
        
        System.out.print("\nIngrese el nombre del Producto: ");
        String producto = leer.next().toUpperCase();
        
        System.out.print("\nIngrese el Precio del del Producto "+ producto +": ");
        Double precio = leer.nextDouble();
        
        mapaProductos.put(producto, precio);
    }
    
    public void modificarPrecioProducto(){
        
        System.out.print("Introduce el códido del producto del que quieres cambiar el precio: ");
        nombreProducto = leer.next().toUpperCase();
        //modificaPrecio(codigo, listaProductos);
         
        if(mapaProductos.containsKey(nombreProducto)){
            
            System.out.print("Introduce el Nuevo Precio del Producto: ");
            mapaProductos.put(nombreProducto, leer.nextDouble());            
            
        } else {
        
            System.out.println("No hay ningun producto con ese código.");
        }
    }

    public void eliminarProducto(){
  
        System.out.print("\nIngrese el Nombre del producto que desea eliminar: ");
        nombreProducto = leer.next().toUpperCase();
        
        if (mapaProductos.containsKey(nombreProducto)) {
        
            mapaProductos.remove(nombreProducto);
            
        } else {
            
            System.out.println("\nNo hay ningun producto con ese Nombre.");  
        }
    }       

    public void mostrarProductos(){
        
        for (Map.Entry<String, Double> verProducto : mapaProductos.entrySet()) {
            String key = verProducto.getKey();
            Double val = verProducto.getValue();
            
            System.out.println("\nEl Producto "+ key +" tiene un Valor de $"+ val +" Pesos");
        }
    }
}
