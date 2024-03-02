package BasicJava;
/* Program made as a way to see how "import" command works.
 * Nothing really to comment, as basic as it looks.
 * Made in 1/4/2024 and translated (mainly variables and outputs) in 1/13/2024.
 */

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class BasicSystemData {
    public static void main(String[] args) {
        Date calendarDate = new Date();
        System.out.println("Date: " + calendarDate);

        Locale language = Locale.getDefault();
        System.out.println("System language: " + language.getDisplayLanguage());

        Locale country = Locale.getDefault();
        System.out.println("Country: " + country.getDisplayCountry());

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int screenwidth = (int) size.getWidth();
        int screenheight = (int) size.getHeight();
        System.out.println("Your screen resolution is " + screenwidth + " x " + screenheight);
    }
}
