
package Bank_App;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import utilities.CSV;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new LinkedList();
        String file = "C:\\Users\\admin\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccountHolder = CSV.read(file);
        Iterator var4 = newAccountHolder.iterator();

        while(var4.hasNext()) {
            String[] accountHolder = (String[])var4.next();
            String name = accountHolder[0];
            int socialSecurityNumber = Integer.parseInt(accountHolder[1]);
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + socialSecurityNumber + " " + accountType + " " + initDeposit);
            if (accountType.equals("Savings")) {
                accounts.add(new SavingsAccount(name, socialSecurityNumber, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new CheckingAccount(name, socialSecurityNumber, initDeposit));
            } else {
                System.out.println("error reading the account type!");
            }
        }

        var4 = accounts.iterator();

        while(var4.hasNext()) {
            BankAccount acccountElement = (BankAccount)var4.next();
            acccountElement.showInfo();
        }

    }
}
