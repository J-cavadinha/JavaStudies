/* Program that reads x student's grades (10) and then displays the amount of grades of every grade from 0 to 10.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCounter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        gradecount(scan);
    }

    public static void gradecount(Scanner scan) {
        int[] grades = new int[11];
        int newgrade = 0;

        do {
            try {
                System.out.print("Type in a grade: ");
                newgrade = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please, input an integer.");
                scan.nextLine();
            }

            switch (newgrade) {
                case -1:
                    System.out.println("Your data: ");
                    break;

                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    grades[newgrade] += 1;
                    break;

                default:
                    System.out.println("Invalid grade.");
            }
        } while (newgrade != -1);
        gradeviewer(grades);
    }

    public static void gradeviewer(int[] vector) {
        for (int i = 0; i < 11; i++) {
            System.out.printf("Grade: %d\tAmount: %d\n", i, vector[i]);
        }
    }
}
