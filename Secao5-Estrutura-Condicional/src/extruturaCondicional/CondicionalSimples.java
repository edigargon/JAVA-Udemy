package extruturaCondicional;
/*
    REGRA:
        V = Executa o Bloco de Comandos;
        F = Pula o Bloco de Comandos;
 */
public class CondicionalSimples {
    public static void main(String[] args){

        int x = 5;

        System.out.println("Bom dia");

        if (x < 0) {
            System.out.println("Boa tarde");
        }

        System.out.println("Boa Noite");
    }
}
