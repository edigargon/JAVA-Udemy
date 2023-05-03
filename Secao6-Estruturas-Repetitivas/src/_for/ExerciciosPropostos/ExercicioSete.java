package _for.ExerciciosPropostos;

/*
    Fazer um programa para ler um número inteiro positivo N. O programa deve então
    mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número
    da linha, depois o quadrado e o cubo do valor, conforme exemplo.
*/

import java.util.Scanner;

public class ExercicioSete {
    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            int quadrado, cubo;
            quadrado = (int) Math.pow( i, 2);
            cubo = (int) Math.pow(i, 3);
            System.out.printf("O valor %d tem como quadrado o valor %d e seu cubo é %d%n", i, quadrado, cubo);
        }

        sc.close();

    }
}
