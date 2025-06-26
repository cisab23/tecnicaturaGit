/*
Ejercicio 1: Construir un programa que, dado un número total de horas, 
devuelve el número de semanas, días y horas equivalentes.
Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 */

package clase12_ejercicio1;

import java.util.Scanner;

public class Clase12_Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de horas: ");
        int horasTotal = entrada.nextInt();
        
        //Calcular semanas
        int semanas = horasTotal / (7 * 24);
        
        //Calcular horas
        int horas = horasTotal % (7 * 24);
        
        //Calcular los dias
        int dias = horas / 24;
        
        System.out.println("\n");
        System.out.println(horasTotal + " horas corresponden a: "+ semanas + " semanas, " + dias + " dias y "+ horas + " horas");
        
        entrada.close();
    }
    
}
