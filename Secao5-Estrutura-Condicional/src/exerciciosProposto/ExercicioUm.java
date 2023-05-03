package exerciciosProposto;

/*
    Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */


import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num;

        num = sc.nextInt();

        if (num == 0) {
            System.out.println("ZERO NÃO VALE, TENTA OUTRO NÚMERO");
        }
        else if (num > 0 ) {
            System.out.println("NÃO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }
    }
}
