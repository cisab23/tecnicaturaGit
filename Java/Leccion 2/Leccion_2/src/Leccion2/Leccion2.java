package Leccion2;

public class Leccion2 {
    public static void main(String[] args) {
    // Clase 10 - Estructuras de control
        var condicion = false;
        if (condicion){
            System.out.println("Condicion verdadera"); // Condicional simple
        }
        else{
            System.out.println("Condicion falsa"); // Condicional doble
        }
        
        var numero = 5;
        var numeroTexto = "Numero desconocido";
        if (numero == 1){
            numeroTexto = "Numero uno";
        }
        else if (numero == 2){
            numeroTexto = "Numero dos";
        }
        else if (numero == 3){
            numeroTexto = "Numero tres"; 
        }
        else if (numero == 4){
            numeroTexto = "Numero cuatro";
        }
        else{
            System.out.println("numeroTexto = " + numeroTexto);
        }
        
    }
}

