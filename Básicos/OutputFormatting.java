import java.util.Scanner;
import java.util.Formatter;

public class Solution {

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
