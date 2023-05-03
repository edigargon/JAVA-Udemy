package membrosEstaticos.problemaExemplo.application;

import membrosEstaticos.problemaExemplo.util.Calculator;
import membrosEstaticos.problemaExemplo.util.SecondCalculator;

import java.util.Locale;
import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = SecondCalculator.circumference(radius);
        double v = SecondCalculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", SecondCalculator.PI);


        scanner.close();
    }
}
