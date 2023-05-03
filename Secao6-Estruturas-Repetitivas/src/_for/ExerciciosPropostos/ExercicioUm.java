package _for.ExerciciosPropostos;

/*
    Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
    um valor por linha, inclusive o X, se for o caso.
*/

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Informe um valor: ");
        x = sc.nextInt();

        for (int i =1; i <= x && x <= 1000; i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
