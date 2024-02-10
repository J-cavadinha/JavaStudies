package OOP.BankExercise;

public class BankAcc {
    public int accNumber;
    protected String accType;
    private String owner;
    private float balance;
    private boolean status;

    public BankAcc(int accNumber, String accType, String owner) {
        this.setAccNumber(accNumber);
        this.setAccType(accType);
        this.setOwner(owner);
        this.balance = 0;
        this.status = true;
    }

    void status() {
        System.out.println("///////////////////////////////////////////////");
        System.out.println("Account number: " + this.getAccNumber());
        System.out.println("Account type: " + this.getAccType());
        System.out.println("Account owner: " + this.getOwner());
        System.out.println("Account balance: " + this.balance);
        System.out.println("Account status: " + this.status);
        System.out.println("///////////////////////////////////////////////");
    }

    // public void close_acc(){}

    /*
     * public void deposit(int accNumber, String accType, String owner){
     * Scanner user_input = new Scanner(System.in);
     * 
     * System.out.print("How much would you like to deposit? ");
     * float value = user_input.nextFloat();
     * 
     * this.balance += value;
     * }
     */

    // public void withdraw(int accNumber, String accType, String owner){}

    // public void monthlypay(int accNumber, String accType, String owner){}

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
}
// public float getBalance() {
// return this.balance;

/*
 * public void setBalance(float balance) {
 * this.balance = balance;
 * }
 */

/*
 * public boolean isStatus() {
 * return status;
 * }
 */

// public void setStatus(boolean status) {
// this.status = status;}
