package sintaxeOpcional;

/*
    Exercicio -
    Fazer um problema para ler um valor inteiro de 1 a 7 representando um dia
    da semana (sendo 1=domingo, 2=segunda, e assim por diante). Escrever
    na tela o dia da semana correspondente, conforme exemplos.
*/

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um dia da semana, utilizando os números de 1 a 7.%n" +
                           "Sendo 1 = Domingo, 2 = Segunda, etc.. %n");
        int x;
        String dia;

        x = sc.nextInt();

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor Invalido";
                break;
        }

        System.out.println("Dia da Semana: " + dia);

        sc.close();
    }
}
