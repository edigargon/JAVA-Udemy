package debug;

import java.util.Locale;
import java.util.Scanner;
  /*
        Executar o programa pelo modo Debub, para ver o passo a passo do programa
   */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, metroQuadrado, area, preco;

        System.out.println("Informe a Largura do Terreno: ");
        largura = sc.nextDouble();
        System.out.println("Informe o Comprimento do Terreno: ");
        comprimento = sc.nextDouble();
        System.out.println("Informe o Valor do Metro Quadrado: ");
        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Preço = %.2f%n", preco);

        sc.close();
    }
}