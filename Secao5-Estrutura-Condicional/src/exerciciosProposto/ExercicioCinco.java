package exerciciosProposto;

/*
    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
    A seguir, calcule e mostre o valor da conta a pagar.

    ------------------------------------------
    | CODIGO  |   ESPECIFICAÇÃO   | PREÇO   |
    |    1    | Cachorro Quente   | R$ 4.00 |
    |    2    | X-Salada          | R$ 4.50 |
    |    3    | X-Bacon           | R$ 5.00 |
    |    4    | Torrada Simples   | R$ 2.00 |
    |    5    | Refrigerante      | R$ 1.50 |
    -----------------------------------------
*/

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, qtd;
        double total;

        System.out.println("Informe o CÓDIGO do Item: ");
        cod = sc.nextInt();
        System.out.println("Informe a QUANTIDADE: ");
        qtd = sc.nextInt();

        if (cod == 1) {
            total = qtd * 4;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (cod == 2) {
            total = qtd * 4.50;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if(cod == 3) {
            total = qtd * 5;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if(cod == 4) {
            total = qtd * 2;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if(cod == 5) {
            total = qtd * 1.50;
            System.out.printf("Total: R$ %.2f", total);
        }
        else {
            System.out.println("Informe um código valido.");
        }

        sc.close();
    }
}
