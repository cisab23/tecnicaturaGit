/*Ejercicio 3: La calificacion final de un estudiante de informática se calcula 
con base a las calificaciones de cuatro aspectos de su rendimiento académico: 
participación, primer examen parcial, segundo examen parcial y examen final.

Sabiendo que las calificaciones anteriores entran a la calificación final con 
ponderaciones de 10%, 25%, 25% y 40%, 
Hacer un programa que calcule e imprima la calificación final obtenida por un 
estudiante. 

Que el usuario digite las calificaciones de estos 4 datos y así podremos tener, 
la calificación final.
*/

package clase12_ejercicio3;

import java.util.Scanner;

public class Clase12_Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final double PARTICIPACION = 0.10;
        final double PRIMERPARCIAL = 0.25;
        final double SEGUNDOPARCIAL = 0.25;
        final double EXAMENFINAL = 0.40;
        
        System.out.println("Ingrese la calificacion de participacion (1 a 10): ");
        double notaParticipacion = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Ingrese la calificacion del primer parcial (1 a 10): ");
        double notaParcial1 = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Ingrese la calificacion del segundo parcial (1 a 10): ");
        double notaParcial2 = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Ingrese la calificacion del examen final (1 a 10): ");
        double notaExmFinal = Double.parseDouble(entrada.nextLine());
        
        double calificacionFinal = (notaParticipacion * PARTICIPACION) + (notaParcial1 * PRIMERPARCIAL) + (notaParcial2 * SEGUNDOPARCIAL) + (notaExmFinal * EXAMENFINAL);
        
        System.out.println("\nResultado: ");
        System.out.println("La calificacion final del alumno es: "+ calificacionFinal);
    }
    
}
