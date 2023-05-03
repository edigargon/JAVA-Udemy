package funcoesMatematicas;

public class Main {

    public static void main(String[] args){
        double x = 3.0;
        double y = 4.0;
        double z = 5.0;

        double a, b, c;
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(z);
        System.out.println("Raiz quadradada de " + x + " é: " + a);
        System.out.println("Raiz quadradada de " + y + " é: " + b);
        System.out.println("Raiz quadradada de " + z + " é: " + c);

        a = Math.pow(x, 2.0);
        b = Math.pow(y, 2.0);
        c = Math.pow(z, 2.0);
        System.out.println(x + " elevado ao quadrado é: " + a);
        System.out.println(y + " elevado ao quadrado é: " + b);
        System.out.println(z + " elevado ao quadrado é: " + c);

        a = Math.abs(x);
        b = Math.abs(y);
        c = Math.abs(z);
        System.out.println("O valor absoluto de " + x + " é: " + a);
        System.out.println("O valor absoluto de " + y + " é: " + b);
        System.out.println("O valor absoluto de " + z + " é: " + c);
    }

}
