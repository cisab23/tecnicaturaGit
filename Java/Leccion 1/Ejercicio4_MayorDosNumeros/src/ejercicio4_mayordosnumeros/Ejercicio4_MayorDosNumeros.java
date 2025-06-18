/*Ejercicio: El mayor de 2 números
Usaremos el Operador Ternario
Le vamos a pedir los números al usuario
*/

package ejercicio4_mayordosnumeros;

import java.util.Scanner;

public class Ejercicio4_MayorDosNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        int mayor = (num1 > num2) ? num1 : num2;
        System.out.println("\nEl numero mayor es: "+ mayor);
    }
    
}
