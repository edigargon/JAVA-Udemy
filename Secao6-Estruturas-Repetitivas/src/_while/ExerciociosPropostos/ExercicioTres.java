package _while.ExerciociosPropostos;

/*
    Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
    Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
    1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
    1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando
    o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de
    clientes que abasteceram cada tipo de combustível, conforme exemplo.
*/

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num=0, alcool=0, gasolina=0, diesel=0;

        while (num != 4) {
            System.out.printf("Escolha uma das opções:%n" +
                              "1. Álcool%n" +
                              "2. Gasolina%n" +
                              "3. Diesel%n" +
                              "4. Fim%n");
            num = sc.nextInt();
            if (num == 1){
                alcool += 1;
            } else if (num == 2){
                gasolina += 1;
            } else if (num == 3) {
                diesel += 1;
            } else if (num == 4){
                break;
            }
        }

        System.out.printf("MUITO OBRIGADO%n" +
                          "1. Álcool: %d %n" +
                          "2. Gasolina: %d %n" +
                          "3. Diesel: %d %n", alcool, gasolina, diesel);

        sc.close();

    }
}
