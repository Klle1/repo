public class CheckingAccount extends BankAccount {
    // Define fee as a constant with a more descriptive name
    private static final double WITHDRAWAL_FEE = 0.15;

    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount);
        // Append "-10" to the account number to indicate a checking account
        setAccountNumber(getAccountNumber() + "-10");
    }

    @Override
    public boolean withdraw(double amount) {
        // Calculate the total amount to withdraw, including fees
        double totalWithdrawalAmount = amount + WITHDRAWAL_FEE;
        
        // Call the parent class's withdraw method with the updated amount
        return super.withdraw(totalWithdrawalAmount);
    }
}
