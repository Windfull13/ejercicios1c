import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        long dinero;
        long mon1000;
        long mon500;
        long mon200;
        long mon100;
        long mon50;
        long mon1;

        screen.println( "Ingrese una cantidad de dinero: ");
        dinero= keyboard.nextLong();
        mon1=dinero;
        mon1000 = (mon1-mon1%1000)/1000;
        mon1=mon1%1000;
        mon500 = (mon1-mon1%500)/500;
        mon1=mon1%500;
        mon200 = (mon1-mon1%200)/200;
        mon1=mon1%200;
        mon100 = (mon1-mon1%100)/100;
        mon1=mon1%100;
        mon50 = (mon1-mon1%50)/50;
        mon1=mon1%50;

        screen.println("Para este monto de dinero se requieren "+mon1000+" monedas de $1000, "+mon500+" monedas de $500, "+mon200+" monedas de $200, "+mon100+" monedas de $100, "+mon50+" monedas de 50$ y "+mon1+" monedas de 1$ ");
        }
    }
