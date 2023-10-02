import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        long celular;
        int indicador;
        long temporal;

        screen.println("Ingrese un numero celular: ");
        celular = keyboard.nextLong();
        temporal = celular / 10000000;
        indicador = Math.toIntExact(temporal);
        screen.println("El indicador es: " +indicador);
    }
}
