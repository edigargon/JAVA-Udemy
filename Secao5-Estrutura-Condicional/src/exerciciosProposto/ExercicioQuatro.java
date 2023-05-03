package exerciciosProposto;

/*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.println("Informe a hora inicial do jogo: ");
        horaInicial = sc.nextInt();
        System.out.println("Informe a hora final do jogo: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        if (duracao > 24) {
            System.out.println("O JOGO DUROU MAIS DE 24 HORAS, FAVOR ALTERAR OS HORÁRIOS");
        }
        else {
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }

        sc.close();

    }
}
