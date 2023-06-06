package matrizes.exerciciosResolvidos.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidades de Colunas e Linhas da Matriz: ");
        int n = scanner.nextInt();
        int [][] matriz = new int[n][n];
        int count = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("Informe o valor para posição %d x %d: ", i, j);
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] < 0 ){
                    count++;
                }
            }
        }

        System.out.println("Main Diagonal: ");
        for (int i =0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        System.out.println("Negative numbers = " + count);

        scanner.close();

    }
}
