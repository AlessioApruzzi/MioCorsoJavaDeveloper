package bank;

public class Account {

    private String accountHolderName;
    private int accountNumber;  // default 0 rappresenta identificativo
    private double balance;

    private int nOperations;
    //  ipotizzo 100 operazioni totali
    private final int TOTAL_OPERATIONS = 100;

    //ipotizzo 100 operazioni totali
    private OperationType[] operations = new OperationType[TOTAL_OPERATIONS];

    public Account(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (nOperations < TOTAL_OPERATIONS) {

            balance += amount;  // aggiorno saldo

            operations[nOperations] = OperationType.D;  // uso Enum per la tipologia di operazione
            nOperations++;

            System.out.println(amount + "deposited succesfully!. Current balance: " + balance);
        } else {
            System.out.println("No more operations available");
        }
    }


    public void withdraw(double amount) {

        // Potrebbe essere una idea mettere le due condizioni insieme con un && e dare un messaggio di errore denerico
        if (nOperations < TOTAL_OPERATIONS) {
            if (balance >= amount) {

                balance -= amount;  // aggiorno saldo

                operations[nOperations] = OperationType.D;  // uso Enum per la tipologia di operazione
                nOperations++;

                System.out.println(amount + "withdraw succesfully!. Current balance: " + balance);
            } else {
                System.out.println("Insufficient balance. Unable to withdraw");
            }
        } else {
            System.out.println("No more operations available");
        }
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    /*
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    ha senso toglierlo per non poter far cambiare la chiave primaria
     */

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getnOperations() {
        return nOperations;
    }

    public void setnOperations(int nOperations) {
        this.nOperations = nOperations;
    }

    public OperationType[] getOperations() {
        return operations;
    }

    public void setOperations(OperationType[] operations) {
        this.operations = operations;
    }
}
