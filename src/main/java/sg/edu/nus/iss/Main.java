package sg.edu.nus.iss;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        BankAccount john = new BankAccount("John", 2050);
        BankAccount tom = new BankAccount("Tom", 2025);
        BankAccount ben = new BankAccount("Ben");

        System.out.printf("%s account number: %s\n", john.getName(), john.getAccNumber());
        System.out.printf("%s account number: %s\n", tom.getName(), tom.getAccNumber());
        System.out.printf("%s account number: %s\n", ben.getName(), ben.getAccNumber());

        john.deposit(2000);
        john.withdraw(1000);
        // tom.setClosed(true);
        tom.withdraw(1000);
        ben.deposit(1000);
        // ben.withdraw(1500);

        System.out.println(john.getName() + " transaction history: " + john.getTransactions());
        System.out.println(tom.getName() + " transaction history: " + tom.getTransactions());
        System.out.println(ben.getName() + " ben transaction history: " + ben.getTransactions());

        FixedDepositAccount mary = new FixedDepositAccount("Mary", 8000);
        FixedDepositAccount felicia = new FixedDepositAccount("felicia", 10000, 5, 12);
        FixedDepositAccount gwen = new FixedDepositAccount("Gwen", 5000, 4);

        System.out.printf("%s account number: %s\n", mary.getName(), mary.getAccNumber());
        System.out.printf("%s account number: %s\n",felicia.getName(), felicia.getAccNumber());
        System.out.printf("%s account number: %s\n", gwen.getName(), gwen.getAccNumber());

        mary.setInterest(5);
        mary.setMonths(12);
        // mary.setInterest(4);

        felicia.deposit(20000);
        felicia.setMonths(9);
        // felicia.setMonths(6);

        gwen.withdraw(500);

        System.out.printf("%s fixed deposit account balance $%.2f\n", mary.getName(), mary.getBalance());
        System.out.printf("%s fixed deposit account balance $%.2f\n", felicia.getName(), felicia.getBalance());
        System.out.printf("%s fixed deposit account balance $%.2f\n", gwen.getName(), gwen.getBalance());
    }
}
