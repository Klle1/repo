public class SavingsAccount extends BankAccount {
    private static final double ANNUAL_INTEREST_RATE = 0.025;
    private static int savingsCounter = 0;
    private String accountNumber;

    /**
     * Constructor for savings account
     * @param name   Account holder's name
     * @param amount Initial account balance
     */
    public SavingsAccount(String name, double amount) {
        super(name, amount);
        accountNumber = super.getAccountNumber() + "-" + savingsCounter;
        savingsCounter++;
    }

    /**
     * Copy constructor for savings account
     * @param originalAccount Original savings account to copy
     * @param balance         New account balance
     */
    public SavingsAccount(SavingsAccount originalAccount, double balance) {
        super(originalAccount, balance);
        savingsCounter++;
        this.accountNumber = originalAccount.accountNumber;
    }

    /**
     * Calculate and apply monthly interest
     */
    public void postInterest() {
        double monthlyInterestRate = ANNUAL_INTEREST_RATE / 12;
        double monthlyInterest = monthlyInterestRate * getBalance();
        deposit(monthlyInterest);
    }

    /**
     * Return the account number
     * @return Account number as a String
     */
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}

