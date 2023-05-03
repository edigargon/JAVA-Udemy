package _while;

/*
    * Recomandações: Usar quando não se sabe previamente a quantidade de repetições;
    * Regra :
        * V: Executa e Volta;
        * F: Não Executa;
 */


import java.util.Scanner;

public class ExercicioBase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = 1, soma = 0;

        while (x != 0) {
            System.out.println("Informe um Valor: ");
            x = sc.nextInt();
            soma += x;
        }

        System.out.println("A Soma dos Números Informados foi: " + soma);

        sc.close();
    }
}
