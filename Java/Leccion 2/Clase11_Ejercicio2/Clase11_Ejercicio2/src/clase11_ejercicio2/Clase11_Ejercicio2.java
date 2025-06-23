/* En un almacen se hace un 20 MOD de descuento a los clientes cuya compra
supere los $100. Cual sera la cantidad que pagara una persona por su compra?
 */

package clase11_ejercicio2;

import java.util.Scanner;

public class Clase11_Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double compra, descuento, precioFinal;
        
        System.out.println("Ingrese la cantidad a pagar: ");
        compra = entrada.nextDouble();
        
        if(compra>100){
            descuento = compra * 0.2;
        }
        else{
            descuento = 0;
        }
        
        precioFinal = compra - descuento;
        System.out.println("El precio final a pagar es: "+ precioFinal);
    }
    
}
