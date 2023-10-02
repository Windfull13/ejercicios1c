import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double cantpeso;
        double cantdol;
        double canteur;

        screen.println("Ingrese una cantidad de pesos: ");
        cantpeso = keyboard.nextDouble();
        cantdol = cantpeso / 4053.50;
        canteur = cantpeso / 4348.15;
        screen.println("La conversion de la cantidad indicada de pesos en dolares es: " +cantdol+ " y en euros es: " +canteur);
    }
}