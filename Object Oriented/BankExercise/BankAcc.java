public class BankAcc {
    public int accNumber;
    protected String accType;
    private String owner;
    private float balance;
    private boolean status;

    public BankAcc() {
        openAcc(this.getAccType());
        System.out.println("A new account has been opened.");
    }

    public void accountDetails() {
        System.out.println("-------------------------------");
        System.out.println("Account: " + this.getAccNumber());
        System.out.println("Type: " + this.getAccType());
        System.out.println("Name: " + this.getOwner());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Status: " + this.getStatus());
    }

    // Done
    public void openAcc(String t) {
        this.setAccType(t);
        this.setStatus(true);
        if (t == "checkings") {
            this.setBalance(50);
        } else if (t == "savings") {
            this.setBalance(150);
        }
    }

    // Done
    public void closeAcc() {
        if (this.getBalance() > 0) {
            System.out.println("There is still money in the account");
        } else if (this.getBalance() < 0) {
            System.out.println("You have debits.");
        } else {
            this.setStatus(false);
        }
    }

    // Done
    public void deposit(float value) {
        if (this.getStatus()) {
            this.setBalance(this.getBalance() + value);
            System.out.println("Sucessful deposit on " + this.owner + " 's account.");
        } else {
            System.out.println("Impossible to deposit on a closed account");
        }
    }

    // Done
    public void withdraw(float value) {
        if (this.getStatus()) {
            if (this.getBalance() >= value) {
                this.setBalance(this.getBalance() - value);
            } else {
                System.out.println("Not suficient funds.");
            }
        } else {
            System.out.println("Impossible to withdraw, account is closed");
        }
    }

    // Done
    public void monthlypay() {
        float v = 0;
        if (this.getAccType() == "savings") {
            v = 12;
        } else if (this.getAccType() == "checkings") {
            v = 20;
        }

        if (this.getStatus()) {
            if (this.getBalance() > v) {
                this.setBalance(this.getBalance() - v);
            } else {
                System.out.println("Insuficient funds.");
            }
        } else {
            System.out.println("Impossible to pay, account is closed");
        }
    }

    public int getAccNumber() {
        return this.accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccType() {
        return this.accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}