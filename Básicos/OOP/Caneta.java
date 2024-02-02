package OOP;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    float carga;
    boolean tampa;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Situação: " + this.tampa);
    }

    void escreve() {
        if (this.tampa == true) {
            System.out.println("Escrito!");
        } else {
            System.out.println("Impossível escrever, caneta com tampa");
        }
    }

    void tampar() {
        this.tampa = true;
    }

    void destampar() {
        this.tampa = false;
    }
}
