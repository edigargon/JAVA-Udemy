package exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioValorPagar {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idpeca, idpeca2, qtpeca, qtpeca2;
        double valorpeca, valorpeca2, valorpago;

         idpeca = sc.nextInt();
         qtpeca = sc.nextInt();
         valorpeca = sc.nextDouble();

         idpeca2 = sc.nextInt();
         qtpeca2 = sc.nextInt();
         valorpeca2 = sc.nextDouble();

         valorpago = (qtpeca * valorpeca) + (qtpeca2 * valorpeca2);

        System.out.printf("VALOR A PAGAR = R$ %.2f",valorpago);

        sc.close();

    }


}
