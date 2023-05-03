package entradeDeDados;

import java.util.Scanner;

public class EntradaTeclado {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma palavra que gostaria de aparecer na tela: ");
        String x;
        x = sc.next();
        System.out.println("Você digitou: "+ x);

        System.out.println("Informe uma número que gostaria de aparecer na tela: ");
        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        System.out.println("Informe uma número com ponto flutuante que gostaria de aparecer na tela: ");
        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z);

        System.out.println("Informe uma variavel char que gostaria de aparecer na tela: ");
        char a;
        a = sc.next().charAt(0);
        System.out.println("Você digitou: " + a);

        sc.close();

    }
}
