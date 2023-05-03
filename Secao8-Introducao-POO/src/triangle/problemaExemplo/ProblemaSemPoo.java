package triangle.problemaExemplo;

/*
    Fazer um programa para ler as medidas dos lados de dois triangulos X e Y (suponha medidas
    válidas). Em seguida, mostrar o valor das areas dos triangulos e dizer qual dos dois triangulos
    possui a maior área.
    A formula para calcular a area de um triangulo a partir das medidas de seus lados a, b e c é
    a seguinte:
    area = raizquadrada(p(p-a)*(p-b)*(p-c))  onde p = a+b+c/2
*/

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSemPoo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

    }
}
