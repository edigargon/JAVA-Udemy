package vetores.exerciciosFixacao.problemaDadosPessoas.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);

        double[] heigth = new double[qtd];
        char[] gender = new char[qtd];
        double sum = 0;
        int countF = 0, countM = 0;

        for (int i = 0; i < heigth.length; i++){
            System.out.printf("Altura da %dº pessoa: ", i + 1);
            heigth[i] = scanner.nextDouble();
            clearBuffer(scanner);
            System.out.printf("Genero da %dº pessoa: ", i + 1);
            gender[i] = scanner.next().charAt(0);
            if (gender[i] == 'F' || gender[i] == 'f'){
                sum += heigth[i];
                countF += 1;
            } else {
                countM += 1;
            }
        }

        double smaller = heigth[0], bigger = heigth[0];

        for (int i = 0; i < heigth.length; i++){
            if (heigth[i] < smaller){
                smaller = heigth[i];
            }
            if (heigth[i] > bigger){
                bigger = heigth[i];
            }
        }

        double avg = sum / countF;

        System.out.println();
        scanner.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
