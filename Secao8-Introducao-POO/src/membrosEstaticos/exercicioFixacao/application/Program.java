package membrosEstaticos.exercicioFixacao.application;

import membrosEstaticos.exercicioFixacao.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price?: ");
        double priceDollar = scanner.nextDouble();
        System.out.print("How many dollars will be bougth?: ");
        double dollarBought = scanner.nextDouble();
        System.out.printf("Amount to be paid in reais = R$ %.2f", CurrencyConverter.converter(priceDollar,dollarBought));

        scanner.close();

    }
}
