package bank;

public class Test {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Bank myBank = new Bank();
        Account acc1 = new Account("Davide",12345,100.00);
        Account acc2 = new Account("Lavinia",67890,1000.00);
        myBank.addAccount(acc1);
        myBank.addAccount(acc2);

        myBank.deposit(12345,50);
        myBank.withdraw(12345, 100);


        myBank.deposit(67890,500);
        myBank.withdraw(67890, 10);


        System.out.println( "Account 12345" +  myBank.getBAlance(12345));  //refactor metodo in bank.java per la stampa
        myBank.printOperations(12345);


        System.out.println(  "Account 67890 " + myBank.getBAlance(67890));
        myBank.printOperations(67890);

        System.out.println(myBank.getAccountByNumber(12345));
    }
}