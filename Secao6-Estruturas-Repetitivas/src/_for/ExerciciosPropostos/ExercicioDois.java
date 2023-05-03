package _for.ExerciciosPropostos;

/*
    Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão
    lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e
    quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a
    palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números que quer digitar: ");
        int n = sc.nextInt();

        int in = 0, out = 0;
        for (int i = 0; i < n; i++){
            System.out.printf("Informe o %d número: ", i+1);
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.printf("%d in%n" +
                          "%d out%n", in, out);


        sc.close();

    }
}
