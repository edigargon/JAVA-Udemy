package exerciociosFixacao.exercicioDoisSalarioFuncionario.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        double netSalary = grossSalary - tax;
        return netSalary;
    }

    public void increaseSalary(double percentage){
        this.grossSalary += (grossSalary * percentage) / 100.0;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}
