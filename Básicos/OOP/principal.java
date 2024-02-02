package OOP;

public class principal {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.carga = 100.00f;
        caneta1.cor = "azul";
        caneta1.modelo = "bic";
        caneta1.ponta = 0.5f;
        caneta1.tampa = true;

        caneta1.status();
    }
}
