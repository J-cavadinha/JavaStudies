/* Program created to calculate the area of diferent kinds of formats.
 * Made in 1/13/2024 as a way to begin my studies in Java language.
 */

import java.util.Scanner;

// Faltando apenas a estrutura de repetição.

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        char area_option;

        do {
            area_option = menu(user_input);

            switch (area_option) {
                case '1':
                    square(user_input);
                    break;

                case '2':
                    rectangle(user_input);
                    break;

                case '3':
                    triangle(user_input);
                    break;

                case '4':
                    trapeze(user_input);
                    break;

                case '5':
                    return;

                default:
                    System.out.println("Invalid input.");
            }
            System.out.println("---------------------------------------------");
        } while (area_option != '5');
        user_input.close();
    }

    static char menu(Scanner user_input) {

        System.out.println("Type in the kind of area you would like to calculate");
        System.out.println("1 - Square / 2 - Rectangle / 3 - Triangle / 4 - Trapeze / 5 - End");
        char area_option = user_input.next().charAt(0);
        return area_option;
    }

    static void square(Scanner user_input) {
        System.out.print("Type in the size of the square side: ");
        float square_side = user_input.nextFloat();
        System.out.println("The square area is " + (square_side * square_side));
    }

    static void rectangle(Scanner user_input) {
        System.out.print("Type in the rectangle based: ");
        float rectangle_base = user_input.nextFloat();
        System.out.print("Type in the rectangle height: ");
        float rectangle_height = user_input.nextFloat();

        float rectangle_area = rectangle_base * rectangle_height;
        System.out.println("The rectangle area is " + rectangle_area);
    }

    static void triangle(Scanner user_input) {
        System.out.print("Type in the size of the triangle base: ");
        float triangle_base = user_input.nextFloat();
        System.out.print("Type in the size of the triangle height: ");
        float triangle_height = user_input.nextFloat();

        float triangle_area = (triangle_base * triangle_height) / 2;
        System.out.println("The triangle area is " + triangle_area);
    }

    static void trapeze(Scanner user_input) {
        System.out.print("Type in one of the trapeze bases: ");
        float trapeze_base1 = user_input.nextFloat();
        System.out.print("Type in the other base: ");
        float trapeze_base2 = user_input.nextFloat();
        System.out.print("Type in the trapeze height: ");
        float trapeze_height = user_input.nextFloat();

        float trapeze_area = ((trapeze_base1 + trapeze_base2) * trapeze_height) / 2;
        System.out.println("The trapeze area is " + trapeze_area);
    }
}