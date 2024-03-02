package BasicJava;
/* Program made as a java data types introduction, my first java code.
 * Made in 1/3/2024 and translated to English (mainly variables and outputs) in 1/13/2024.
 */

public class DataTypes {
    public static void main(String[] args) {
        char character1 = '1';
        String phrase = "Hello World!";
        boolean boolean1 = true;
        int integer1 = 100;
        float decimal1 = 100.50f;

        System.out.println("Character: " + character1);
        System.out.println("Phrase: " + phrase);
        System.out.println("Boolean value: " + boolean1);
        System.out.println("Integer value: " + integer1);
        System.out.println("Decimal value: " + decimal1);

        String phrase2 = "Im ";
        String phrase3 = " years old";
        int random_age = 10;
        System.out.println(phrase2 + random_age + phrase3);
    }
}
