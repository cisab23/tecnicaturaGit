/* Ejercicio 1: Tienda de libros
Mostrar: Ingrese los siguientes datos del libro
Digite el nombre del libro
Digite el ID del libro
Digite el precio del libro
Indicar si el envío es gratuito (True/False)
Mostrar:
Nombre:
ID: 
Precio:
Envío Gratuito?:
*/

package ejercicio1_tiendadelibros;

import java.util.Scanner;

public class Ejercicio1_TiendaDeLibros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        
        System.out.println("Ingrese el ID del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        
        
        System.out.println("Ingrese el precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Confirme si el envio es gratuito (true/false): ");
        boolean envioGratis = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreLibro+" #"+idLibro);
        System.out.println("Precio del libro: $"+ precioLibro);
        System.out.println("El envio es gratuito?: "+ envioGratis);
    }
    
}
