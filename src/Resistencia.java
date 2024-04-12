import java.text.DecimalFormat;
import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {

        double rt;
        int rt1;
        int rt2;
        int rt3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese resistencia 1");
        rt1 = sc.nextInt();

        System.out.println("Ingrese resistencia 2");
        rt2 = sc.nextInt();

        System.out.println("Ingrese resistencia 3");
        rt3 = sc.nextInt();

        rt = 1/ (1d/rt1 + 1d/rt2 + 1d/rt3);

        DecimalFormat df = new DecimalFormat("#.#");

        System.out.println("La resistencia total es: " + df.format(rt));
    }
}