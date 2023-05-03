package exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTresValores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi;

        System.out.println("Informe o valor de A");
        a = sc.nextDouble();
        System.out.println("Informe o valor de B");
        b = sc.nextDouble();
        System.out.println("Informe o valor de C");
        c = sc.nextDouble();
        pi = 3.14159;

        triangulo = (a * c) / 2;
        circulo = (c * c) * pi;
        trapezio = ((a + b) * c) / 2;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();

    }
}
