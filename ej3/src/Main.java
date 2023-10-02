import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        float horas;
        float valhora;
        float retencion;
        float salbruto;
        float salneto;
        float retfte;

        screen.println("Ingrese las horas trabajadas: ");
        horas= keyboard.nextFloat();
        screen.println("Ingrese el valor por hora de trabajo: ");
        valhora= keyboard.nextFloat();
        screen.println("Ingrese el porcentaje de retencion: ");
        retencion= keyboard.nextFloat();
        salbruto= horas*valhora;
        retfte=salbruto*(retencion/100);
        salneto=salbruto-retfte;
        screen.println("El salario bruto es: "+salbruto+"La retención en la fuente es: "+retfte+"El salario neto es: "+salneto);
    }
}