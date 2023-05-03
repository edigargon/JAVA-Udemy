package exerciciosProposto;

/*
    Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
    de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
    ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
    Se o ponto estiver na origem, escreva a mensagem “Origem”.
    Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
    situação.
*/

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;
        System.out.println("Diga um número que represente o Eixo X");
        x = sc.nextDouble();
        System.out.println("Diga um número que represente o Eixo Y");
        y = sc.nextDouble();

        if (y == 0 && x == 0) {
            System.out.println("Origem");
        }
        else if (y == 0 && x != 0) {
            System.out.println("Eixo X");
        }
        else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        }
        else if (y > 0 && x > 0) {
            System.out.println("Q1");
        }
        else if (y > 0 && x < 0) {
            System.out.println("Q2");
        }
        else if (y < 0 && x < 0) {
            System.out.println("Q3");
        }
        else if (y < 0 && x > 0) {
            System.out.println("Q4");
        }

    }
}
