package OOP.BankExercise;

import java.util.Scanner;

public class BankAcc {
    public int accNumber;
    protected String accType;
    private String owner;
    private float balance;
    private boolean status;

    public BankAcc(int accNumber, String accType, String owner) {
        this.status = true;
        this.setAccType(accType);
        this.setAccNumber(accNumber);
        this.setOwner(owner);
        // if para implementar o 'íncentivo'
        this.balance = 0;
    }

    public int user_option(Scanner user_input) {
        System.out.print(
                "Bank Menu\n0 - End  1 - New account  2 - Deposit  3 - Withdraw  4 - Pay tax  5 - Close account: ");
        int option = user_input.nextInt();

        switch (option) {
            case 0:
                option = 0;
                return option;
            case 1:
                break;

            case 2:
                deposit(this.accNumber, this.accType, this.owner, user_input);
                break;

            case 3:
                withdraw(this.accNumber, this.accType, this.owner, user_input);
                break;

            case 4:
                monthlypay(this.accNumber, this.accType, this.owner);
                break;

            case 5:
                close_acc();
                break;

            default:
                System.out.println("Input error, try again.");
        }
        return -1;
    }
    // Se for corrente começa com 50 e poupança com 150

    // Não é possível fechar conta com dinheiro e nem devendo
    // Operações com a conta necessitam uma verificação se está aberta primeiro
    // Corrente paga 12 p mes e poupança 20

    void status() {
        System.out.println("///////////////////////////////////////////////");
        System.out.println("Account number: " + this.getAccNumber());
        System.out.println("Account type: " + this.getAccType());
        System.out.println("Account owner: " + this.getOwner());
        System.out.println("Account balance: " + this.balance);
        System.out.println("Account status: " + this.status);
        System.out.println("///////////////////////////////////////////////");
    }

    public void close_acc() {
    }

    public void deposit(int accNumber, String accType, String owner, Scanner user_input) {

        System.out.print("How much would you like to deposit? ");
        float value = user_input.nextFloat();

        this.balance += value;
    }

    public void withdraw(int accNumber, String accType, String owner, Scanner user_input) {
        System.out.println("How much would you like to withdraw? ");
        float value = user_input.nextFloat();
        this.balance -= value;
    }

    public void monthlypay(int accNumber, String accType, String owner) {
        if (accType == "savings") {
            this.balance -= 20.0;
            System.out.println("You have sucessfully paid your monthly tax.");
            System.out.println(this.balance);
        } else if (accType == "checkings") {
            this.balance -= 12.0;
            System.out.println("You have sucessfully paid your monthly tax.");
            System.out.println(this.balance);
        }
        // No else cuz bank acc is "limited" for now, soon to have an error handling
        // when
        // getting the type so i don't think an else will be needed here
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
