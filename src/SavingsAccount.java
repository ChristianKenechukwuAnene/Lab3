import javax.swing.*;

public class SavingsAccount extends BankAccount {

    private double balance;

    public SavingsAccount(){
        this.balance=0.0;
    }
    public SavingsAccount(String name, int accNum,double balance){
        super(name,accNum);
        this.balance=balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public String toString(){
        return super.toString() +"\nBalance: " + getBalance();
    }
    public double calcTax(){
        return 0.0125*getBalance();
    }
    public void lodge(double amount){
        setBalance(amount + getBalance());
    }
    public void withdraw(double amount){
        setBalance(getBalance()-amount);
    }
}
