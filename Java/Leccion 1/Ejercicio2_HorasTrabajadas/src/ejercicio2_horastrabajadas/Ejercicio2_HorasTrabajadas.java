/* Hacer un programa que calcule e imprima el salario de un empleado, a partir
de sus horas trabajadas y de su salario por hora.
 */

package ejercicio2_horastrabajadas;

import java.util.Scanner;

public class Ejercicio2_HorasTrabajadas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese las horas trabajadas: ");
        double horas = entrada.nextDouble();
        System.out.println("Ingrese el valor de la hora: ");
        double valor = entrada.nextDouble();
        double salario = horas * valor;
        System.out.println("El salario del empleado es: $"+ salario);
    }
    
}
