package exerciociosFixacao.exercicioUmRetangulo.application;

import exerciociosFixacao.exercicioUmRetangulo.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter rectangle width: ");
        rectangle.wigth = sc.nextDouble();
        System.out.print("Enter rectangle height: ");
        rectangle.heigth = sc.nextDouble();

        System.out.println(rectangle);
    }
}
