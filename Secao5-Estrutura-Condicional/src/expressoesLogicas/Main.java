package expressoesLogicas;

/*
Operadores:
    && = E
    || = OU
    ! = NÃO
 */

public class Main {
    public static void main(String[] args){

        int x = 5;

        System.out.println("Operador && = E");
        System.out.println("____________________________________" );
        System.out.println("x <= 20 && x == 10");
        System.out.println(x <= 20 && x == 10);
        System.out.println("____________________________________" );
        System.out.println("x > 0 && x != 3");
        System.out.println(x > 0 && x != 3);
        System.out.println("____________________________________" );
        System.out.println("x <= 20 && x == 10 && x != 3");
        System.out.println(x <= 20 && x == 10 && x != 3);
        System.out.printf("____________________________________%n" );
        System.out.println("Operador || = OU");
        System.out.println("____________________________________" );
        System.out.println("x == 10 || x <= 20");
        System.out.println(x == 10 || x <= 20);
        System.out.println("____________________________________" );
        System.out.println("x > 0 || x != 3");
        System.out.println(x > 0 || x != 3);
        System.out.println("____________________________________" );
        System.out.println("x <= 0 || x != 3 || x != 5");
        System.out.println(x <= 0 || x != 3 || x != 5);
        System.out.printf("____________________________________%n" );
        System.out.println("Operador ! = NÃO");
        System.out.println("____________________________________" );
        System.out.println("!(x == 10)");
        System.out.println(!(x == 10));
        System.out.println("____________________________________" );
        System.out.println("!(x >= 2)");
        System.out.println(!(x >= 2));
        System.out.println("____________________________________" );
        System.out.println("!(x <= 20 && x == 10)");
        System.out.println(!(x <= 20 && x == 10));
        System.out.printf("____________________________________%n" );

    }
}
