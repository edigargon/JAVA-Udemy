package listas.exercicioProposto.application;

import listas.exercicioProposto.entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employees> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);

        for (int i = 0; i < qtd; i++){
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("Id: ");
            int id = scanner.nextInt();
            clearBuffer(scanner);
            while (hasId(employees, id)){
                System.out.println("ID already taken! Try Again:");
                id = scanner.nextInt();
                clearBuffer(scanner);
            }
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            clearBuffer(scanner);
            employees.add(new Employees(id, name, salary));
        }

        System.out.print("Enter the employee id that will salary increase: ");
        int id = scanner.nextInt();
        clearBuffer(scanner);
        Employees emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This ID does not exist! ");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            clearBuffer(scanner);
            emp.increaseSalary(percentage);
        }

        System.out.println();
        for (Employees obj : employees){
            System.out.println(obj);
        }
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public static boolean hasId(List<Employees> list, int id) {
        Employees employees = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employees != null;
    }
}
