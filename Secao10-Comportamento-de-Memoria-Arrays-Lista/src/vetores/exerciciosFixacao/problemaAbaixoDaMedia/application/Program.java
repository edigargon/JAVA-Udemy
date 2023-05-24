package vetores.exerciciosFixacao.problemaAbaixoDaMedia.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);
        double[] vect = new double[qtd];
        double sum = 0;

        for (int i = 0; i < vect.length; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            vect[i] = scanner.nextDouble();
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.printf("MÉDIA DO VETOR %.3f%n", avg);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < vect.length; i ++){
            if (vect[i] < avg){
                System.out.println(vect[i]);
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
