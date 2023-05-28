package bank;

import java.util.Arrays;

public class Bank {

    private Account[] accounts;
    private int numAccounts; // indice che mi dice a che punto sono nell'array
    private final int TOTAL_ACCOUNTS = 100; // Posso avere al massimo 100 account

    public Bank() {
        accounts = new Account[TOTAL_ACCOUNTS];
        numAccounts = 0;
    }

    public boolean addAccount(Account account) {

        if (numAccounts < TOTAL_ACCOUNTS) {
            accounts[numAccounts] = account;
            numAccounts++;

            System.out.println("Account created succesfully");
            return true;
        } else {
            System.out.println("No more accounts available");
            return false;
        }
    }

    public boolean deposit(int accountNumber, double amount) {
        Account account = getAccountByNumber(accountNumber);

        if (account != null) {
            account.deposit(amount);
            return true;
        } else {
            System.out.println("Account not found");
            return false;
        }
    }


    public boolean withdraw(int accountNumber, double amount) {
        Account account = getAccountByNumber(accountNumber);

        if (account != null) {
            account.withdraw(amount);
            return true;
        } else {
            System.out.println("Account not found");
            return false;
        }
    }

    public double getBAlance(int accountNumber) {

        Account account = getAccountByNumber(accountNumber);

        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account not found");
            return -1;  // vuold dire che non ho trovato nessun conto associato a quel numero
        }
    }


    public void printOperations(int accountNumber) {

        Account account = getAccountByNumber(accountNumber);

        if (account != null) {
            System.out.println(Arrays.toString(accounts));
            //account.printOperations
        } else {
            System.out.println("Account not found");

        }
    }

   // public void printOperations(){

  //  }

    public Account getAccountByNumber(int accountNumber) {

        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }


}
