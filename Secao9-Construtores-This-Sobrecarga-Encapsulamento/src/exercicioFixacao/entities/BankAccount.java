package exercicioFixacao.entities;

public class BankAccount {

    private int numberAccount;
    public String name;
    public double  amountAccount;

    public BankAccount(int numberAccount, String name, double amountAccount) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.amountAccount = amountAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountAccount() {
        return amountAccount;
    }

    public void depositAccount(double deposit){
        this.amountAccount += deposit;
    }

    public void withdrawalAccount(double withdrawal){
        this.amountAccount -= (withdrawal+5);
    }
}


