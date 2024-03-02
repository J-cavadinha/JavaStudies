import java.util.Scanner;

public class MethodsP1 {
    public static void main(String[] args) {
        Pen_1 pen1 = new Pen_1();
        pen1.ink = 100.00f;
        pen1.color = "azul";
        pen1.model = "bic";
        pen1.tip = 0.5f;
        pen1.cap = true;
        // pen1.owner = "João";
        // The code above is not going to run since 'owner' is private

        pen1.status();

        Scanner user_input = new Scanner(System.in);
        char option;

        do {
            System.out.print("1 - Cap on \t 2 - Cap off \t 0 - End: ");
            option = user_input.next().charAt(0);

            switch (option) {
                case '0':
                    break;

                case '1':
                    pen1.put_cap();
                    pen1.status();
                    break;

                case '2':
                    pen1.takeoff_cap();
                    pen1.status();
                    break;

                default:
                    System.out.println("Invalid input.");
            }
        } while (option != '0');

        user_input.close();
    }
}
