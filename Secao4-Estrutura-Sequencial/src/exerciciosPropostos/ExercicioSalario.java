package exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSalario {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id, hrsTrab;
        double  valHrs, valor;

        id = sc.nextInt();
        hrsTrab = sc.nextInt();
        valHrs = sc.nextDouble();

        valor = hrsTrab * valHrs;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = %.2f",valor);

        sc.close();

    }
}
