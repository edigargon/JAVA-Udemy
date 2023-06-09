package matrizes.exerciciosProposto.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas a Matriz terá? ");
        int row = scanner.nextInt();
        System.out.print("Quantas colunas a Matriz terá? ");
        int columns = scanner.nextInt();
        int matrix[][] = new int[row][columns];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.printf("Informe o valor para posição %d x %d: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("-------------------------------------");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.printf("%02d | ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");

        System.out.print("Informe o número que será procurado: ");
        int searchNumber = scanner.nextInt();
        System.out.println();

        boolean found = false;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchNumber) {
                    System.out.printf("Position %d x %d: %n", i, j);

                    if (j > 0) {
                        System.out.printf("Left: %02d%n", matrix[i][j - 1]);
                    }

                    if (j < columns - 1) {
                        System.out.printf("Right: %02d%n", matrix[i][j + 1]);
                    }

                    if (i > 0) {
                        System.out.printf("Up: %02d%n", matrix[i - 1][j]);
                    }

                    if (i < row - 1) {
                        System.out.printf("Down: %02d%n", matrix[i + 1][j]);
                    }

                    found = true;
                }
            }
        }

        if(!found){
            System.out.printf("O número %d não foi encontrado na matriz.",searchNumber);
        }


        scanner.close();
    }
}
