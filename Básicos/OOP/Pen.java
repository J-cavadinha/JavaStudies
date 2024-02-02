package OOP;

public class Pen {
    String model;
    String color;
    float tip;
    float ink;
    boolean cap;

    void status() {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Tip: " + this.tip + "mm");
        System.out.println("Ink: " + this.ink + "%");
        System.out.println("Is the cap on? " + this.cap);
    }

    void write() {
        if (this.cap == true) {
            System.out.println("Written!");
        } else {
            System.out.println("Impossible to write, the cap is still on.");
        }
    }

    void put_cap() {
        this.cap = true;
    }

    void takeoff_cap() {
        this.cap = false;
    }
}
