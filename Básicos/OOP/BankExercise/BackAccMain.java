package OOP.BankExercise;

import java.util.Scanner;

public class BackAccMain {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Type in your bank account number: ");
        int accNumber = user_input.nextInt();

        user_input.nextLine();

        System.out.print("Type in your account type (savings/checkings): ");
        String accType = user_input.nextLine();

        System.out.print("Type in your name: ");
        String owner = user_input.nextLine();

        BankAcc account1 = new BankAcc(accNumber, accType, owner);
        account1.status();

        user_input.close();
    }
}
