
package Bank_App;

public class SavingsAccount extends BankAccount {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public SavingsAccount(String name, int socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        this.accountNumber = "1" + this.accountNumber;
        this.safetyDepositBoxID = this.getSafetyDepositBoxDetails(3);
        this.safetyDepositBoxKey = this.getSafetyDepositBoxDetails(4);
    }

    public double setInterestRate() {
        return this.InterestRate() - 0.25;
    }

    private int getSafetyDepositBoxDetails(int power) {
        int code = (int)(Math.random() * Math.pow(10.0, (double)power));
        return code;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Savings Account Features \n Safety Deposit Box ID : " + this.safetyDepositBoxID + "\n Safety Deposit Box Key : " + this.safetyDepositBoxKey);
    }
}
