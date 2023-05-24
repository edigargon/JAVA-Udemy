package vetores.exerciciosFixacao.problemaMaiorPosicao.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);

        double[] vect = new double[qtd];
        int position = 0;
        double lager = 0;

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite o %dº número: ", i +1);
            vect[i] = scanner.nextDouble();
            if (lager < vect[i]){
                lager = vect[i];
                position = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", lager);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d",position);

        scanner.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
