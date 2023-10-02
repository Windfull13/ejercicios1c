import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double largo;
        double ancho;
        double alto;
        double dimen;
        double litros;
        double dimenal90;
        screen.println("Ingrese el largo de su acuario: ");
        largo=keyboard.nextDouble();
        screen.println("Ingrese el ancho de su acuario: ");
        ancho=keyboard.nextDouble();
        screen.println("Ingrese el alto de su acuario: ");
        alto=keyboard.nextDouble();
        dimen=largo*ancho*alto;
        litros= dimen/1000;
        dimenal90=(litros*90)/100;
        screen.println("Los litros necesarios para llenar el acuario son: "+dimenal90+ " litros");
    }
}
