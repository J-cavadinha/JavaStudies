public class BackAccMain {
    public static void main(String[] args) {

        BankAcc ac1 = new BankAcc();
        ac1.setAccNumber(1);
        ac1.setOwner("João Cavadinha");
        ac1.openAcc("checkings");

        BankAcc ac2 = new BankAcc();
        ac2.setAccNumber(2);
        ac2.setOwner("Anna Julia");
        ac2.openAcc("savings");

        ac1.deposit(100);
        ac2.deposit(500);

        ac2.withdraw(100);

        ac1.withdraw(150);
        ac1.closeAcc();

        ac1.accountDetails();
        ac2.accountDetails();
    }
}
