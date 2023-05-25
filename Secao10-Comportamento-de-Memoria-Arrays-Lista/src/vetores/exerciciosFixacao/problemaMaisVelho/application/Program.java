package vetores.exerciciosFixacao.problemaMaisVelho.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);

        String[] name = new String[qtd];
        int[] age = new int[qtd];

        for(int i = 0; i < name.length; i++){
            System.out.printf("Dados da %dª pessoa: %n", i+1);
            System.out.print("Nome: ");
            name[i] = scanner.nextLine();
            System.out.print("Idade: ");
            age[i] = scanner.nextInt();
            clearBuffer(scanner);
        }
        int lager = age[0];
        int position = 0;

        for(int i = 0; i < age.length; i++){
            if(age[i] > lager) {
                lager = age[i];
                position = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", name[position]);


        scanner.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
