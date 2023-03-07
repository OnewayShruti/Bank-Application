
package Bank_App;

import java.util.Scanner;

public abstract class BankAccount implements BaseRateInterface {
    private String name;
    private int socialSecurityNumber;
    private String accountType;
    private double initialDeposit;
    protected String accountNumber;
    private double balance;
    double interestRate;
    private static int fiveDigitUniqueNumber = 10000;
    private int randomNumber;
    Scanner userInput;

    public BankAccount(String name, int socialSecurityNumber, double initialDeposit) {
        this.userInput = new Scanner(System.in);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.balance = initialDeposit;
        ++fiveDigitUniqueNumber;
        this.accountNumber = this.generateAccountNo();
        this.interestRate = this.setInterestRate();
    }

    public abstract double setInterestRate();

    private String generateAccountNo() {
        String account = "";
        account = account + this.socialSecurityNumber % 100;
        account = account + fiveDigitUniqueNumber;
        account = account + (int)(Math.random() * Math.pow(10.0, 3.0));
        return account;
    }

    public void accuredInterest() {
        double accuredInterest = this.balance * (this.interestRate / 100.0);
        System.out.println("Accured interest rate added to your account : " + accuredInterest);
        this.balance += accuredInterest;
        this.printBalance();
    }

    public void depositMoney(double amount) {
        this.balance += amount;
        System.out.println("Balance credited to the account : " + this.balance);
        this.printBalance();
    }

    public void withDrawMoney(double amount) {
        this.balance -= amount;
        System.out.println("Balance debited from the account : " + this.balance);
        this.printBalance();
    }

    public void transferMoney(String whereTo, double amount) {
        this.balance -= amount;
        System.out.println("Amount of money " + amount + " is transfered to " + whereTo);
        this.printBalance();
    }

    public void printBalance() {
        System.out.println("Current balance is : " + this.balance);
    }

    public void showInfo() {
        System.out.println("\n***********\n");
        System.out.println("Name : " + this.name + "\nAccount Number : " + this.accountNumber + "\nBalance : " + this.balance + "\nRate : " + this.interestRate + "%");
    }
}
