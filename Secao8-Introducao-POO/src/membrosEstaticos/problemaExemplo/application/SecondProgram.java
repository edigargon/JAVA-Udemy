package membrosEstaticos.problemaExemplo.application;

import membrosEstaticos.problemaExemplo.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class SecondProgram {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = calculator.circumference(radius);
        double v = calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calculator.PI);


        scanner.close();
    }
}
