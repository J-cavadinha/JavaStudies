package OOP.OOP2;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Type in the pen model: ");
        String model = user_input.nextLine();

        System.out.print("Type in the pen color: ");
        String color = user_input.nextLine();

        System.out.print("Type in the pen tip thickness: ");
        float tip = user_input.nextFloat();

        Pen pen1 = new Pen(model, color, tip);
        pen1.status();

        user_input.close();
    }

}
