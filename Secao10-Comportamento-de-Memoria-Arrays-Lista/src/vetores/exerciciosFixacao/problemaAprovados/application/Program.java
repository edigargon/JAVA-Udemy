package vetores.exerciciosFixacao.problemaAprovados.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);

        String[] name = new String[qtd];
        double[] noteOne = new double[qtd];
        double[] noteTwo = new double[qtd];
        double[] sum = new double[qtd];
        double avg = 0.0;

        for (int i = 0; i < name.length; i++){
            System.out.printf("Digite o nome do %dº aluno: ", i+1);
            name[i] = scanner.nextLine();
            System.out.print("Digite a 1ª nota: ");
            noteOne[i] = scanner.nextDouble();
            clearBuffer(scanner);
            System.out.print("Digite a 2ª nota:  ");
            noteTwo[i] = scanner.nextDouble();
            clearBuffer(scanner);
            sum[i] = noteOne[i] + noteTwo[i];
        }

        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < sum.length; i++){
            if(sum[i] / 2 >= 6.0){
                System.out.println(name[i]);
            }
        }

        scanner.close();
    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
