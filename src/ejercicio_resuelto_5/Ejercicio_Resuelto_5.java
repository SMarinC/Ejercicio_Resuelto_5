
package ejercicio_resuelto_5;

public class Ejercicio_Resuelto_5 {

    public static void main(String[] args) {
        double Suma, X, Y;
        Suma = 0;
        X = 20;
        Suma = Suma + X;
        Y = 40;
        X = X + Math.pow (Y, 2);
        Suma = Suma + (X/Y);
        System.out.println("El Valor de la Suma es: " + Suma);
    }
    
}
