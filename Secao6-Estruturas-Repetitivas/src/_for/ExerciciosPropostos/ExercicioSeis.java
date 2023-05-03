package _for.ExerciciosPropostos;

/*
    Ler um número inteiro N e calcular todos os seus divisores.
*/

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número que gostaria de ver seus divisores: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
