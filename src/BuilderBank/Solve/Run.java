package BuilderBank.Solve;

public class Run {
    public static void main(String[] args) {
        BankAccount account = new BankAccount.Builder(1234L)
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getBranch());
        System.out.println(account.getOwner());
        System.out.println(account.getInterestRate());
    }
}