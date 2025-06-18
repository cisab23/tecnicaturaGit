
import java.util.Scanner;

// Clase 1: Nuestro primer programa Hola mundo
public class HolaMundo {

    public static void main(String[] args) {
        //System.out.println("Hola mundo, desde Java");

    /* Clase 2 - Variables en Java parte 1
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        // Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
        
    // Clase 3 - Variables en Java parte 2
        // Var - inferencia de tipos en Java
        var miVariableEntera = 10;
        var miVariableCadena = "Seguimos estudiando";
        System.out.println("miVariableEntera = " + miVariableEntera);
        System.out.println("miVariableCadena = " + miVariableCadena);
        // soutv + tab

        // Reglas para definir una variable en Java
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));

        // Ejercicio: Caracteres Especiales con Java
        var nombre = "Natalia";
        System.out.println("\nNueva linea: \n" + nombre); // Diagonal inversa y letra n para hacer un salto de linea
        System.out.println("Tabulador: \t" + nombre); // Tabulador un espacio para centrar
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroseso: \b\b"+nombre); // Caracter de Retroceso
        System.out.println("Comillas Simples: \'"+nombre+"\'");
        System.out.println("Comillas Dobles: \""+nombre+"\""); 
       
        
        // Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);
        
    // Clase 4 - Tipos primitivos en Java parte 1
        // Tipos numericos enteros
        byte numEnteroByte = (byte)127; // Conversion de tipos
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: "+ Byte.MAX_VALUE);
        // Perdida de precision: Perdida de bits al momento de hacer la conversion.
        // Se recomienda que con byte y short se utilice int
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: "+ Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: "+ Short.MAX_VALUE);
            
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = "+ numEnteroInt);
        System.out.println("Valor minimo de int: "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo de int: "+ Integer.MAX_VALUE);
            
        long numEnteroLong = 10;
        System.out.println("numEnteroLong = "+ numEnteroLong);
        System.out.println("Valor minimo del Long: "+ Long.MIN_VALUE);
        System.out.println("Valor maximo del Long: "+ Long.MAX_VALUE);
            
        //Tipos primitivos - Tipos flotantes
         float numFloat = 3.4028235E38F; //Por defecto Java asignara el decimal al tipo Double
         System.out.println("numFloat = "+ numFloat);
         System.out.println("Valor minimo de Float ="+ Float.MIN_VALUE);
         System.out.println("Valor maximo de Float ="+ Float.MAX_VALUE);
            
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = "+ numDouble);
        System.out.println("Valor minimo de Double: "+ Double.MIN_VALUE);
        System.out.println("Valor maximo de Double: "+ Double.MAX_VALUE);
         */
        
    // Clase 5 - Tipos primitivos en Java parte 2
        //Inferencia de tipos var y tipos primitivos
        /*var numEntero = 20; //Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //Automaticamente con el punto se transforma en un double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        //Tipos primitivos char
        /*char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Valor decimal de unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //UN caracter especial, podemos copiar y peegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        var varCaracter1 = '\u0024'; //Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal2 = (char)36; //Valor entero y le asigna un tipo int
        System.out.println("varCaracterDecimal2 = " + varCaracterDecimal2);
        var varCaracterSimbolo3 = '$'; //UN caracter especial, podemos copiar y peegar desde unicode
        System.out.println("varCaracterSimbolo3 = " + varCaracterSimbolo3);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/
        
    // Clase 6 - Tipos primitivos en Java parte 3
        //Tipos primitivos tipo booleanos
        /*var varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool){ //Se puede poner directamente la variable
            System.out.println("La bandera es verde");
        }
        
        else{
            System.out.println("La bandera es roja");
        }
        
        //Algoritmo: Es mayor de edad?
        var edad = 18; //Literal tener presente la inferencia de tipos
        //var adulto = edad >= 18; //Esta es una expresion booleana
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }*/
        //Conversion de tipos primitivos
        /*var edad = Integer.parseInt("20"); //Recibe el tipo string para poder convertirlo a entero
        System.out.println("edad = " + (edad + 1)); //Va a sumar
         */
        /*var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1)); //Va a concatenar en vez de sumar
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);*/
        //Pedir un valor
//       var entrada = new Scanner(System.in);
//       /*System.out.println("Digite su edad: ");
//       System.out.println("Digite su edad: ");
//       edad = Integer.parseInt(entrada.nextLine());
//       System.out.println("entrada = " + edad);*/
//       
//       //Conversion de tipos primitivos en Java parte 2
//       var edadTexto = String.valueOf(10);
//       System.out.println("edadTexto = " + edadTexto);
//       
//       var fraseChar = "programadores".charAt(4);
//       System.out.println("fraseChar = " + fraseChar);
//        
//       System.out.println("Digite un caracter: ");
//       fraseChar = entrada.nextLine().charAt(0); // No convierte a enteros, ya que recupera cadenas
//       System.out.println("fraseChar = " + fraseChar);
    
    // Clase 7 - Operadores en Java parte 1
        /* //Operadores aritmeticos
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);
        
       solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
    
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
        
        solucion = num1/num2;
        System.out.println("solucion de la divison = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("resultado de la division = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo de ka division
        System.out.println("solucion = " + solucion); // 5/4
        
        if (num1 % 2 == 0)
            System.out.println("Es un numero Par");
        else
            System.out.println("Es un numero Impar"); */
        
        //Operadores de asignacion
        /*
        int varNum1 = 1;
        int varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2;
        System.out.println("VarNum3: " + varNum3);
       
        varNum1 += 1;
        System.out.println("VarNum1: " + varNum1);
        varNum2 -= 2;
        System.out.println("VarNum2: " + varNum2);
        varNum1 *= 5;
        System.out.println("VarNum1: " + varNum1);
        varNum3 /= 4;
        System.out.println("VarNum3: " + varNum3);
        varNum1 %= 6;
        System.out.println("VarNum1: " + varNum1);
         */
        
    // Clase 8: Operadores unarios
        //Cambio de signo (Positivo o negativo)
        /*var varA = 7;
        var varB = -varA;
        System.out.println("varA:" + varA);
        System.out.println("varB:" + varB);

        //Operador de negacion (True a false o viceversa)
        var varC = true;
        var varD = !varC;
        System.out.println("varC:" + varC);
        System.out.println("varD:" + varD);

        //Operador de incremento : Preincremento
        var varE = 9;
        var varF = ++varE;
        System.out.println("varE: " + varE);
        System.out.println("varF: " + varF);

        //Operador de incremento : Postincremento
        var varG = 3;
        var varH = varG++;
        System.out.println("varG: " + varG);
        System.out.println("varH: " + varH);

        //Operadores unarios de decremento 
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI: " + varI);

        //Post decremento
        var varK = 8;
        var varL = varK--;
        System.out.println("varK: " + varK);
        System.out.println("varL: " + varL);

        //Operadores de igualdad y relacionales
        var aNum = 5;
        var bNum = 6;
        var cNum = (aNum == bNum);
        System.out.println("cNum:" + cNum);
        var dNum = aNum != bNum;
        System.out.println("dNum: " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "Bye Bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar:" + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar:" + fVar);

        //Operadores relacionales
        var gVar = aNum >= bNum;
        System.out.println("gVar:" + gVar);

        if (bNum % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        
        var edad = 15;
        var adulto = 18;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
        
        // Operadores condicionales
        var valorA = 7;
        var valorMinimo = 0; //Rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if (respuesta) {
            System.out.println("Esta dentro del rango");
        }
        else {
            System.out.println("Esta fuera del rango");
        }
        
       // Ejercicio vacaciones de un padre
       var vacaciones = false;
       var diaLibre = false;
       if (vacaciones || diaLibre) {
           System.out.println("Puede asistir al juego de su hijo");
       }
       else {
           System.out.println("No puede asistir al juego de su hijo");
       }
       
       // Operador ternario
       var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);
        
        // Prioridad de los operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--; // Preincremento y posdecremento
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //10
        var solucionAritmetica = 4 + 5 * 6 / 3; //4 + ((5 * 6) / 3) = 30
        */
    }
}
