package extruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalComposta {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double hora;

        System.out.println("Que Horas são?  Ex: 12.00");
        hora = sc.nextDouble();

        if (hora < 12) {
            System.out.println("Bom dia");
        }
        else if (hora < 18) {
            System.out.println("Boa Tarde");
        }
        else {
            System.out.println("Boa Noite");
        }

        sc.close();
    }
}
