/*
    Checklist
        * Formatar: toLowerCase(), toUpperCase(), trim()
        * Recortar: substring(inicio), substring(inicio, fim)
        * Substituir: Replace(char, char), Replace(string, string)
        * Buscar: IndexOf, LastIndexOf
        * str.Split(" ")

*/

public class FuncoesString {
    public static void main(String[] args){

        String original = "abcd FGHIJ ABC abc DEFG      ";

        String minusculas = original.toLowerCase();
        String maiusculas = original.toUpperCase();
        String semEspacos = original.trim();
        String subs = original.substring(2);
        String subs2 = original.substring(2, 9);
        String rep = original.replace('a', 'x');
        int i = original.indexOf("bc");
        int j = original.indexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase(): -" + minusculas + "-");
        System.out.println("toUpperCase(): -" + maiusculas + "-");
        System.out.println("trim(): -" + semEspacos + "-");
        System.out.println("substring(2): -" + subs + "-");
        System.out.println("substring(2, 9): -" + subs2 + "-");
        System.out.println("replace(a, x): -" + rep + "-");
        System.out.println("indexOf(bc): " + i);
        System.out.println("lastIndexOf(bc): " + j);

        /* SPLIT */

        String s = "potato apple lemon";

        String[] vetor = s.split(" ");

        System.out.println("SPLIT usando a frase: " + s);
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);



    }
}
