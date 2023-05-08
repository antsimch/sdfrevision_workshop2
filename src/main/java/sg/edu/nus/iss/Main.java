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

        System.out.println(john.getAccNumber());
        System.out.println(tom.getAccNumber());
        System.out.println(ben.getAccNumber());

        john.deposit(2000);
        john.withdraw(1000);
        // tom.setClosed(true);
        tom.withdraw(1000);
        ben.deposit(1000);
        // ben.withdraw(1500);

        System.out.println(john.getTransactions());
        System.out.println(tom.getTransactions());
        System.out.println(ben.getTransactions());
    }
}
