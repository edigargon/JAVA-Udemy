package vetores.exerciciosFixacao.problemaMediaPares.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);

        int[] vect = new int[qtd];
        int sum = 0;
        int count = 0;

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            vect[i] = scanner.nextInt();
            if(vect[i] % 2 == 0){
                sum += vect[i];
                count += 1;
            }
        }

        if(count == 0){
            System.out.println("NENHUM NÚMERO PAR");
        } else {
            double avg = sum / count;
            System.out.printf("MÉDIA DOS PARES = %.1f%n", avg);
        }

        scanner.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
