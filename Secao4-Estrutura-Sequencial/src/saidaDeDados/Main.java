package saidaDeDados;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello world! ");
        //sem quebra de linha
        System.out.println("Bom dia !");
        //com quebra de linha

        System.out.println("Declarando uma Variavel e Imprimindo na Tela");
        int y = 32;
        System.out.println(y);
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n",x);
        Locale.setDefault(Locale.US); //Imprime as casas decimais com ".", no formato do EUA
        System.out.printf("%.2f%n",x);

        //CONCATENADNO
        System.out.println("Resultado "+x+" em Metros");
        System.out.printf("Resultado %.2f em Metros%n",x);

        String nome = "Edigar";
        int idade = 26;
        double salario = 4800.00;
        System.out.printf("%s tem %d anos de idade e recebe R$: %.2f%n", nome, idade, salario);
    }
}