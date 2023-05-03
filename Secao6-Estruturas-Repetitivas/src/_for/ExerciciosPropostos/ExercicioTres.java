package _for.ExerciciosPropostos;

/*
    Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada
    caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente
    a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor
    tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
*/

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de casos que gostaria de testar: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o 1º valor: ");
            double n1 = sc.nextDouble();
            System.out.println("Informe o 2º valor: ");
            double n2 = sc.nextDouble();
            System.out.println("Informe o 3º valor: ");
            double n3 = sc.nextDouble();

            double media;
            media = ((n1*2)+(n2*3)+(n3*5))/10;
            System.out.printf("A média dos valores é: %.1f%n",media);
        }


        sc.close();

    }
}
