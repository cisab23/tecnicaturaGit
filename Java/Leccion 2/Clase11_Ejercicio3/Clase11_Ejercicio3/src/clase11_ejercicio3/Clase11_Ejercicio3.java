/* Leer 2 numeros; si son iguales, que los multiplique.
Si el primero es mayor que el segundo, que los reste.
Y si no, que los sume.
 */

package clase11_ejercicio3;

import java.util.Scanner;

public class Clase11_Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double num1, num2, resultado;
        
        System.out.println("Digite dos numeros: ");
        num1 = entrada.nextDouble();
        num2 = entrada.nextDouble();
        
        if(num1 == num2){
            resultado = num1 * num2;
        }
        else if (num1 > num2){
            resultado = num1 - num2;
        }
        else{
            resultado = num1 + num2;
        }
        
        System.out.println("El resultado es: "+ resultado);
    }
    
}
