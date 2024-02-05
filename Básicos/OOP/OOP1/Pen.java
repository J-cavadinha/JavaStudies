package OOP.OOP1;

public class Pen {
    public String model;
    public String color;
    public float tip;
    public float ink;
    public boolean cap;
    private String owner;

    void status() {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Tip: " + this.tip + "mm");
        System.out.println("Ink: " + this.ink + "%");
        System.out.println("Is the cap on? " + this.cap);
        System.out.println("Owner: " + this.owner);
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
