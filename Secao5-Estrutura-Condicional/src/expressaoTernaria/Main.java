package expressaoTernaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco, desconto;
        System.out.println("Informe do valor do preço: ");
        preco = sc.nextDouble();

        /*
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }*/

        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("Preço do desconto é de R$: %.2f, ficando o valor final de R$%.2f", desconto, preco-desconto);
    }
}
