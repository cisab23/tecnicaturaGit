/*
Ejercicio 2: Hacer un programa que calcule el cuadro de una suma, el usuario 
debe ingresar el valor de a y el valor de b.

Formula: (a+b)2=a2+b2+2*a*b

Para esto deberán utilizar la clase Math y un método llamado pow
 */

package clase12_ejercicio2;

import java.util.Scanner;

public class Clase12_Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Ingresa el valor de A: ");
        double valorA = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Ingresa el valor de B: ");
        double valorB = Double.parseDouble(entrada.nextLine());
        
        //Calculo de la formula (a+b)^2 = a^2 + b^2 + 2*a*b
        double cuadradoA = Math.pow(valorA, 2);
        double cuadradoB = Math.pow(valorB, 2);
        double terminoDoble = 2 * valorA * valorB;
        
        double resultado = cuadradoA + cuadradoB + terminoDoble;
        
        System.out.println("\nEl cuadro de la suma (" + valorA + " + " + valorB + ")^2 es: "+ resultado);
    }
    
}
