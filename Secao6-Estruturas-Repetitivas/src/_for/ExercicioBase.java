package _for;

/*
    Fazer um programa que lê um valor inteiro N e depois N números inteiros.
    Ao final, mostrar a soma dos N números lidos.
*/

import java.util.Scanner;

public class ExercicioBase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números que deseja digitar: ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Informe o %dº número: ",i+1);
            int x = sc.nextInt();
            soma += x;
        }

        System.out.printf("A soma dos números deu: %d",soma);

        sc.close();

    }
}
