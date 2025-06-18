/* Se solicita calcular el área y el perímetro de un rectángulo, para esto deberemos crear las variables:
    Alto (int)
    Ancho(int)
El usuario debe proporcionar los valores de alto, ancho y después se debe imprimir el resultado en el siguiente formato: (recuerden no usar acentos, respetar los espacios, mayúsculas, minúsculas
y saltos de líneas.
Le decimos al usuario:
    Digite el alto del rectángulo:
    Digite el ancho del rectángulo:

Fórmula:
    Área = alto * ancho;
    Perímetro = (alto + ancho) * 2;
¿Cuál es el código del ejercicio planteado?

*/

package ejercicio3_rectangulo;

import java.util.Scanner;

public class Ejercicio3_Rectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el alto del rectangulo: ");
        int alto = entrada.nextInt();
        System.out.println("Ingrese el ancho del rectangulo: ");
        int ancho = entrada.nextInt();
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("\nEl area del rectangulo es: "+ area);
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
    }
    
}
