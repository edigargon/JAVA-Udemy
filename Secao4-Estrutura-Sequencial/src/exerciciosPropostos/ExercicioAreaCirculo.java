package exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAreaCirculo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double raio, pi, area;

        pi = 3.14159;
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2.0);

        Locale.setDefault(Locale.US);
        System.out.printf("A=%.4f",area);





        sc.close();
    }


}
