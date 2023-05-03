package doWhile;

/*
    Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em fahrenheit.
    Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.

    Formula: F = 9c/5 + 32
*/

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahren = ((9*celsius)/5)+32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahren);
            System.out.print("Deseja Repetir? (s/n)");
            resposta = sc.next().charAt(0);
        } while (resposta != 's');

        sc.close();

    }
}
