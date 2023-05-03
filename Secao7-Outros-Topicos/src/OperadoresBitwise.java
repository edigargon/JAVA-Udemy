/*
    ---------------------------------------------------
    | Operador  |               Significado           |
    |    &      |   Operação "E" bit a bit            |
    |    |      |   Operação "OU" bit a bit           |
    |    ^      |   Operação "OU-exclusivo" bit a bit |
    ---------------------------------------------------

    -----------------------     ------------------------        -------------------------
    | C1  | C2  | C1 E C2 |     | C1  | C2  | C1 OU C2 |        | C1  | C2  | C1 XOR C2 |
    -----------------------     ------------------------        -------------------------
    |  F  |  F  |    F    |     |  F  |  F  |    F     |        |  F  |  F  |     F     |
    |  F  |  V  |    F    |     |  F  |  V  |    V     |        |  F  |  V  |     V     |
    |  V  |  F  |    F    |     |  V  |  F  |    V     |        |  V  |  F  |     V     |
    |  V  |  V  |    V    |     |  V  |  V  |    V     |        |  V  |  V  |     F     |
    -----------------------     ------------------------        -------------------------
*/




public class OperadoresBitwise {
    public static void main(String[] args){

        int n1 = 89; //0101 1001
        int n2 = 60; //0011 1100
        System.out.println(n1 & n2); //0001 1000 (24)
        System.out.println(n1 | n2); //0111 1101 (125)
        System.out.println(n1 ^ n2); //0110 0101 (101)

    }
}
