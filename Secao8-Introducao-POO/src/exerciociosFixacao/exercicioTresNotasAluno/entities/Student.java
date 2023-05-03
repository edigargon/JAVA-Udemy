package exerciociosFixacao.exercicioTresNotasAluno.entities;

public class Student {

    public String name;
    public double nota1, nota2, nota3;

    public double sum(){
        return  nota1 + nota2 + nota3;
    }

    public double missingPoints(double result){
        result = 60.00 - result;
        return result;
    }

    public String toString(){
        return "FINAL GRADE = "
                + String.format("%.2f", sum());
    }
}
