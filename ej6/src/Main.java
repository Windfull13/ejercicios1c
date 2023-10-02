import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int seg;
        int dias;
        int horas;
        int min;
        screen.println("Escribe la cantidad de segundos: ");
        seg=keyboard.nextInt();
        dias=(seg-seg%86400)/86400;
        seg=seg%86400;
        horas=(seg-seg%3600)/3600;
        seg=seg%3600;
        min=(seg-seg%60)/60;
        seg=seg%60;
        screen.println("Los segundos dados equivalen a: "+dias+" días "+horas+" horas "+min+" minutos y "+seg+ " segundos");

    }
}