package _for.ExerciciosPropostos;

/*
    Fazer um programa para ler um número N. Depois leia N pares de números e mostre a
    divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem
    "divisao impossivel".
*/


import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número N: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Infome o primeiro valor: ");
            int n1 = sc.nextInt();
            System.out.println("Informe o segundo valor: ");
            int n2 = sc.nextInt();
            if (n2 == 0) {
                System.out.println("Divisão Impossivel");
            } else {
                double div = (double) n1 / n2;
                System.out.println(div);
            }
        }



        sc.close();
    }
}
