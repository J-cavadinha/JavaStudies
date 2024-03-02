package BasicJava;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        int i1 = sc.nextInt();

        String s2 = sc.next();
        int i2 = sc.nextInt();

        String s3 = sc.next();
        int i3 = sc.nextInt();
        // int x = sc.nextInt();

        System.out.println("================================");

        System.out.printf("%-15.15s%03d%n", s1, i1);
        System.out.printf("%-15.15s%03d%n", s2, i2);
        System.out.printf("%-15.15s%03d%n", s3, i3);

        System.out.println("================================");

        sc.close();
    }
}

/*
 * Input Format
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of alphabetic characters, and each integer
 * will be in the inclusive range from to .
 * Output Format
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly
 * characters.
 * The second column contains the integer, expressed in exactly digits; if the
 * original input has less than three digits, you must pad your output's leading
 * digits with zeroes.
 */