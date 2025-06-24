
package leccion_1;

public class Clase_4 {
    public static void main(String[] args) {
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
    }
}
