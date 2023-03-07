package Bank_App;

public class CheckingAccount extends BankAccount {
    private long debitCardNumber;
    private long debitCardPin;

    public CheckingAccount(String name, int socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        this.accountNumber = "2" + this.accountNumber;
        this.debitCardNumber = this.getCheckingAcountDetails(12);
        this.debitCardPin = this.getCheckingAcountDetails(4);
    }

    public double setInterestRate() {
        return this.InterestRate() * 0.15;
    }

    private long getCheckingAcountDetails(int power) {
        long code = (long)(Math.random() * Math.pow(10.0, (double)power));
        return code;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Checkings Account Features \n Debit Card Number : " + this.debitCardNumber + "\n Debit Card Pin : " + this.debitCardPin);
    }
}
