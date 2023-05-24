package vetores.exerciciosFixacao.problemaNegativos.application;

import java.util.Scanner;

/*
    Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */
public class Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextInt();
        }

        System.out.println("Números Negativos: ");

        for(int i = 0; i < vect.length; i++){
            if (vect[i] < 0){
                System.out.printf("%d%n", vect[i]);
            }
        }

        scanner.close();

    }
}
