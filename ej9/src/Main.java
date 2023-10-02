import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int distancia;
        int tiempo;
        int velocidad;
        screen.println("Ingrese una distancia entre 2 puntos: ");
        distancia= keyboard.nextInt();
        screen.println("Ingrese un tiempo para llegar de un punto a otro: ");
        tiempo= keyboard.nextInt();
        velocidad= distancia/tiempo;
        screen.println("La velocidad necesaria para llegar de un punto a otro es: "+velocidad+" m/s");
    }
}