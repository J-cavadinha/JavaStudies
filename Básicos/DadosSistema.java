import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class DadosSistema {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("Data: " + data);

        Locale idioma = Locale.getDefault();
        System.out.println("Idioma: " + idioma.getDisplayLanguage());

        Locale pais = Locale.getDefault();
        System.out.println("País: " + pais.getDisplayCountry());

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) size.getWidth();
        int altura = (int) size.getHeight();
        System.out.println("A resolução é: " + largura + " x " + altura);
    }
}
