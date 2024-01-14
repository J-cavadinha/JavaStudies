
/* Program created to test how input works in java language.
 * Really basic commands really just to see how it is manipulated.
 * Made in 1/4/2024 and translated to English (mainly variables and outputs) in 1/13/2024.
 */
import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        // Exhibit a message asking for the user's name
        System.out.print("Type in your name: ");

        // Ask for user input
        String name = user_input.nextLine();

        System.out.print("Type in your age: ");
        int age = user_input.nextInt();

        System.out.print("Type in your salary: ");
        float salary = user_input.nextFloat();

        // Show messages with the user's input
        System.out.println("Your name is " + name + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("You make " + salary + " monthly.");

        // To free resources
        user_input.close();
    }
}
