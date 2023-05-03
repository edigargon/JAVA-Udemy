package exercicioFixacao.application;

import exercicioFixacao.entities.BankAccount;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numAccount = scanner.nextInt();
        scanner.nextLine(); //consumir o buffer %n
        System.out.print("Enter account holder: ");
        String name = scanner.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String respost = scanner.nextLine();
        double deposit;
        if (Objects.equals(respost, "y") || Objects.equals(respost, "Y")){
            System.out.print("Enter initial deposit value: ");
            deposit = scanner.nextDouble();
        } else {
            System.out.println("Initial value = R$ 0.00");
            deposit = 0.00;
        }

        BankAccount bankAccount = new BankAccount(numAccount, name, deposit);

        System.out.println("Account data:");
        System.out.printf("Account: %d, Holder: %s, Balance: R$ %.2f%n%n",bankAccount.getNumberAccount(), bankAccount.getName(), bankAccount.getAmountAccount());

        System.out.print("Enter a deposit value: ");
        deposit = scanner.nextDouble();
        bankAccount.depositAccount(deposit);
        System.out.println("Update account data:");
        System.out.printf("Account: %d, Holder: %s, Balance: R$ %.2f%n%n",bankAccount.getNumberAccount(), bankAccount.getName(), bankAccount.getAmountAccount());

        System.out.print("Enter a witdrawal value: ");
        double witdrawal = scanner.nextDouble();
        bankAccount.withdrawalAccount(witdrawal);
        System.out.println("Update account data:");
        System.out.printf("Account: %d, Holder: %s, Balance: R$ %.2f%n%n",bankAccount.getNumberAccount(), bankAccount.getName(), bankAccount.getAmountAccount());
    }
}
