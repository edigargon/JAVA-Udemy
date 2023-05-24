package vetores.exerciciosFixacao.problemaSomaVetor.application;

/*
    Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int qtd = scanner.nextInt();

        double[] vect = new double[qtd];
        double soma, media;

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite o %d número: ", i+1);
            vect[i] = scanner.nextDouble();
        }

        System.out.println("VALORES = ");

        for(int i = 0; i < vect.length; i++){
            System.out.printf("%.1f%n", vect[i]);
        }

        soma = 0;
        for(int i = 0; i < vect.length; i++){
            soma = soma + vect[i];
        }

        media = soma / vect.length;

        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);


    }
}
