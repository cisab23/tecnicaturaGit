/* Determinar si un alumno aprueba o reprueba un curso, sabiendo que aprobara
si su promedio de tres calificaciones es mayor o igual a 70. Reprueba caso 
contrario */

package clase11_ejercicio1;

import java.util.Scanner;

public class Clase11_Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;
        System.out.println("Ingrese las tres calificaciones: ");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();
        
        promedio = (nota1 + nota2 + nota3)/3;
        
        if(promedio >= 70){
            System.out.println("El alumno esta aprobado con un promedio de "+ promedio);
        }
        else{
            System.out.println("El alumno esta desaprobado con un promedio de "+ promedio);
        }
    }
    
}
