package vetores.problemaExemploUm.application;

/* Problema Exemplo

    Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
 */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploUm {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de alturas: ");
        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Informe a %dª altura: ", i+1);
            vect[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        scanner.close();
    }
}
