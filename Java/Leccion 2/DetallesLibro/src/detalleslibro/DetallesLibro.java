/*
1. Pregunta o pide el nombre del libro
2. Pregunta o pide el autor del libro
3. Muestra por consola la información: nombreLibro+ " fue escrito por "+ nombreAutor    
4. Van a tener que utilizar la clase Scanner
*/

package detalleslibro;

import java.util.Scanner;
        
public class DetallesLibro {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un libro: ");
        String libro = nombre.nextLine();
        System.out.println("Ingrese el nombre del autor: ");
        String autor = nombre.nextLine();
        System.out.println(libro + " " + "fue escrito por" + " " + autor);
    }
    
}
