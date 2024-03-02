package BasicJava;
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

        // Waiting to learn vectors in order to implement this.
        System.out.print("How many grades would you like to consider? ");
        int amountof_grades = user_input.nextInt();

        System.out.print("Type (1) to calculate a median or (2) to calculate a weighted average: ");
        char median_type = user_input.next().charAt(0);

        if (median_type == '1') {
            median = arithmetic_median(user_input, amountof_grades);
        } else if (median_type == '2') {
            median = weighted_average(user_input, amountof_grades);
        } else {
            System.out.println("Invalid input.");
        }

        System.out.println("-----------------------------------");
        if (median >= 7.0) {
            System.out.println("Congratulations!!! " + student_name + " you have been approved!");
        } else if (median >= 6.0 && median < 7.0) {
            System.out.println("You made it to the finals, " + student_name + ", good luck!");
        } else {
            System.out.println("You have failed, good luck next time!");
        }

        System.out.printf("Your median is %.2f\n", median);
        user_input.close();
    }

    public static float arithmetic_median(Scanner user_input, int amountof_grades) {

        int counter = 0;
        float[] grades = new float[amountof_grades];
        float grades_sum = 0;

        do {
            System.out.printf("Type in your %d grade: ", (counter + 1));
            grades[counter] = user_input.nextFloat();
            counter++;
        } while (amountof_grades > counter);

        for (int i = 0; i < amountof_grades; i++) {
            grades_sum = grades_sum + grades[i];
            System.out.printf("%.2f\t", grades[i]);
        }
        System.out.println();

        return (grades_sum) / (amountof_grades);
    }

    static float weighted_average(Scanner user_input, int amountof_grades) {

        int counter = 0;
        float[] grades = new float[amountof_grades]; // Start a new array object declaring its size (amountof_grades)
        float grades_sum = 0;

        do {
            System.out.printf("Type in your %d grade: ", (counter + 1));
            float aux_grade = user_input.nextFloat();

            System.out.printf("Type in the weight of your %d grade: ", (counter + 1));
            float weight = user_input.nextFloat();

            grades[counter] = aux_grade * weight;
            grades_sum += grades[counter];
            counter++;

        } while (amountof_grades > counter);

        System.out.println();

        for (int i = 0; i < amountof_grades; i++) {
            grades_sum = grades_sum + grades[i];
            System.out.printf("%.2f\t", grades[i]);
        }
        System.out.println();

        return (grades_sum / amountof_grades);
    }
}