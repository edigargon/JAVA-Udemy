package vetores.exerciciosFixacao.problemaSomaVetores.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores terá cada vetor? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);

        int[] vectA = new int[qtd];
        int[] vectB = new int[qtd];
        int[] vectC = new int[qtd];

        for (int i = 0; i < vectA.length; i++){
            System.out.printf("Digite o %dº valor do vetor A: ", i+1);
            vectA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vectB.length; i++){
            System.out.printf("Digite o %dº valor do vetor B: ", i+1);
            vectB[i] = scanner.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vectC.length; i++){
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }

        scanner.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
