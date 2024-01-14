/* Program created to calculate a student's median.
 * It is missing features like a loop controlled by user input to put in the amount of grades
 * wanted and some other details but it is a start on my java studies.
 * Made in 1/8/2024 and translated to English (mainly variables and outputs) in 1/13/2024.
 */

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        float median = 0;

        System.out.print("Type in your name: ");
        String student_name = user_input.nextLine();

        System.out.print("Type (1) to calculate a median or (2) to calculate a weighted median: ");
        char median_type = user_input.next().charAt(0);

        if (median_type == '1') {
            median = arithmetic_median(user_input);
        } else if (median_type == '2') {
            median = weighted_median(user_input);
        } else {
            System.out.println("Invalid input.");
        }

        System.out.println("-----------------------------------");
        if (median >= 7.0) {
            System.out.println("Congratulations!!! " + student_name + " you have been aproved!");
        } else if (median >= 6.0 && median < 7.0) {
            System.out.println("You made it to the finals, " + student_name + ", good luck!");
        } else {
            System.out.println("You have failed, good luck next time!");
        }

        System.out.println("Your anual median is " + median);
        user_input.close();
    }

    static float arithmetic_median(Scanner user_input) {

        System.out.print("Type in your 1st grade: ");
        float grade1 = user_input.nextFloat();

        System.out.print("Type in your 2nd grade: ");
        float grade2 = user_input.nextFloat();

        System.out.print("Type in your 3rd grade: ");
        float grade3 = user_input.nextFloat();
        System.out.print("\n");

        return (grade1 + grade2 + grade3) / 3;
    }

    static float weighted_median(Scanner user_input) { // Cada nota * peso, todas as notas / qtd notas

        System.out.print("Type in your 1st grade: ");
        float grade1 = user_input.nextFloat();
        System.out.print("Type in the weight of your 1st grade: ");
        float weight1 = user_input.nextFloat();
        grade1 = grade1 * weight1;

        System.out.print("Type in your 2nd grade: ");
        float grade2 = user_input.nextFloat();
        System.out.print("Type in the weight of your 2nd grade: ");
        float weight2 = user_input.nextFloat();
        grade2 = grade2 * weight2;

        System.out.print("Type in your 3rd grade: ");
        float grade3 = user_input.nextFloat();
        System.out.print("Type in the weight of your 3rd grade: ");
        float weight3 = user_input.nextFloat();
        grade3 = grade3 * weight3;

        System.out.println();

        float median = (grade1 + grade2 + grade3) / 3;
        return median;

    }
}