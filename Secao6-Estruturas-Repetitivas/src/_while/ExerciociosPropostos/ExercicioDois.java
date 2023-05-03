package _while.ExerciociosPropostos;

/*
    Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de
    pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
    O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta
    situação sem escrever mensagem alguma).
*/


import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = 1, y = 1;

        while (x != 0 || y != 0) {
            System.out.println("Informe o valor para X: ");
            x = sc.nextInt();
            System.out.println("Informe o valor para Y: ");
            y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Quadrante 1");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante 2");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante 3");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrante 4");
            } else {
                break;
            }
        }


        sc.close();
    }
}
