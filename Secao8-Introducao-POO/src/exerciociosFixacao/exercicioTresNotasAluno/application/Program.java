package exerciociosFixacao.exercicioTresNotasAluno.application;

import exerciociosFixacao.exercicioTresNotasAluno.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.name = scanner.nextLine();
        System.out.print("Primeira Nota (Informar nota de 0 a 30): ");
        student.nota1 = scanner.nextDouble();
        System.out.print("Segunda Nota (Informar nota de 0 a 35): ");
        student.nota2 = scanner.nextDouble();
        System.out.print("Terceira Nota (Informar nota de 0 a 35): ");
        student.nota3 = scanner.nextDouble();

        double result = student.sum();
        System.out.println(student);
        if (result >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints(result));
        }

    }
}
