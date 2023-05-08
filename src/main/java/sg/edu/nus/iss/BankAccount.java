package sg.edu.nus.iss;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final String name;
    private final String accNumber;
    private float balance;
    private List<String> transactions;
    private boolean closed;
    private LocalDate startDate;
    private LocalDate endDate;
    private static int num = 12345;

    public BankAccount(String name) {
        this(name, 0);
    }

    public BankAccount(String name, float balance) {
        this.name = name;
        this.balance = balance;
        this.accNumber = "001-" + num;
        num++;
        this.transactions = new ArrayList<>();
        this.closed = false;
        this.startDate = LocalDate.now();
    }

    public void deposit(float amount) {
        if (isClosed()) {
            throw new IllegalArgumentException("Account is closed\n");
        } 
        
        if (amount > 0) {
            String depositMsg = "deposit $" + String.format("%.2f", amount) + " at " + LocalDateTime.now();
            setBalance(getBalance() + amount);
            transactions.add(depositMsg);
            System.out.println(depositMsg);
        } else {
            throw new IllegalArgumentException("Deposit only accepts positive amount\n");
        }
    }

    public void withdraw(float amount) {
        if (isClosed()) {
            throw new IllegalArgumentException("Account is closed\n");
        } 

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw only accepts positive amount\n");
        }

        if ((getBalance() - amount) >= 0) {
            String withdrawMsg = "withdraw $" + String.format("%.2f", amount) + " at " + LocalDateTime.now();
            setBalance(getBalance() - amount);
            transactions.add(withdrawMsg);
            System.out.println(withdrawMsg);
        } else {
            throw new IllegalArgumentException("Amount is greater than current balance\n");
        }
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accNumber=" + accNumber + ", balance=" + balance + ", transactions="
                + transactions + ", closed=" + closed + ", startDate=" + startDate + ", endDate=" + endDate + "]";
    }

    public String getName() {
        return name;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
        this.setEndDate(LocalDate.now()); 
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
