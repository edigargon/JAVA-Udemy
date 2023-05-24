package vetores.exerciciosFixacao.problemaNumerosPares.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas números serão digitadas? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);

        int[] vect = new int[qtd];
        int count = 0;

        for(int i = 0; i < vect.length; i ++){
            System.out.printf("Digite o %dº número: ",i+1);
            vect[i] = scanner.nextInt();
        }

        System.out.printf("NÚMEROS PARES: %n");
        for(int i = 0; i < vect.length; i ++) {
            if (vect[i] % 2 == 0) {
                System.out.println(vect[i]);
                count += 1;
            }
        }

        System.out.printf("QUANTIDADE DE PARES = %d%n",count);

        scanner.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
