
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int res;

        screen.println("Ingrese un numero entero: ");
        num = keyboard.nextInt();
        res= num%2;

        screen.println("El residuo de la division de "+num+" entre 2 es: " +res);
        }
    }




