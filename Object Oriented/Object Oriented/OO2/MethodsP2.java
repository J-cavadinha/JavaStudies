import java.util.Scanner;

public class MethodsP2 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Type in the pen model: ");
        String model = user_input.nextLine();

        System.out.print("Type in the pen color: ");
        String color = user_input.nextLine();

        System.out.print("Type in the pen tip thickness: ");
        float tip = user_input.nextFloat();

        Pen2 pen1 = new Pen2(model, color, tip);
        pen1.status();

        user_input.close();
    }

}
