package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {

    private float interest;
    private int months;
    private boolean interestChanged;
    private boolean monthsChanged;

    public FixedDepositAccount(String name, float balance) {
        this(name, balance, 3.0F, 6);
    }

    public FixedDepositAccount(String name, float balance, float interest) {
        this(name, balance, interest, 6);
    }

    public FixedDepositAccount(String name, float balance, float interest, int months) {
        super(name, balance);
        this.interest = interest;
        this.months = months;
        this.interestChanged = false;
        this.monthsChanged = false;
    }

    @Override
    public void deposit(float amount) {
        System.out.println("you cannot deposit into a fixed deposit account");
    }

    @Override
    public void withdraw(float amount) {
        System.out.println("you cannot withdraw from a fixed deposit account");
    }

    @Override
    public float getBalance() {
        return super.getBalance() * (100 + getInterest()) / 100;
    }

    @Override
    public void setBalance(float balance) {
        System.out.println("Balance for fixed deposit accounts cannot be changed");
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        if (!isInterestChanged()) {
            this.interest = interest;
            setInterestChanged(true);
        } else {
            throw new IllegalArgumentException("Interest has already been changed once");
        }
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        if (!isMonthsChanged()) {
            this.months = months;
            setMonthsChanged(true);
        } else {
            throw new IllegalArgumentException("Duration in months has already been changed once");
        }
    }

    public boolean isInterestChanged() {
        return interestChanged;
    }

    public void setInterestChanged(boolean interestChanged) {
        this.interestChanged = interestChanged;
    }

    public boolean isMonthsChanged() {
        return monthsChanged;
    }

    public void setMonthsChanged(boolean monthsChanged) {
        this.monthsChanged = monthsChanged;
    }
}
