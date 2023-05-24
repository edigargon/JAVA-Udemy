package vetores.exerciciosFixacao.problemaAlturas.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);


        String[] name = new String[qtd];
        int[] age = new int[qtd];
        double[] heigth = new double[qtd];

        for(int i = 0; i < name.length; i++){
            System.out.printf("Dados da %dª pessoa: %n", i+1);
            System.out.print("Nome: ");
            name[i] = scanner.nextLine();
            System.out.print("Idade: ");
            age[i] = scanner.nextInt();
            System.out.print("Altura: ");
            heigth[i] = scanner.nextDouble();
            clearBuffer(scanner);
        }

        double avg, percent;
        double minor = 0;

        avg = 0;
        for(int i = 0; i < heigth.length; i++){
            if (age[i] < 16){
                minor++;
            }
            avg = avg + heigth[i];
        }

        avg = avg / age.length;
        percent = (minor / age.length) * 100;

        System.out.printf("Altura Média: %.2f%n", avg);
        System.out.printf("Porcentagem de Menores de 16 anos: %.1f%%\n", percent);

        for(int i = 0; i < age.length; i++){
            if (age[i] < 16){
                System.out.println(name[i]);
            }
        }
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
