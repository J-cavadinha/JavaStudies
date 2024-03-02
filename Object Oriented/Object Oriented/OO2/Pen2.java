// Class Pen using getters/setters

public class Pen2 {
    public String model;
    private String color;
    private float tip;
    private boolean cap;

    public Pen2(String model, String color, float tip) {
        this.setModel(model);
        this.setColor(color);
        this.setTip(tip);

        this.cap_on();
        this.color = "Blue";
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String m) {
        this.model = m;
    }

    public float getTip() {
        return this.tip;
    }

    public void setTip(float p) {
        this.tip = p;
    }

    public void cap_on() {
        this.cap = true;
    }

    public void cap_off() {
        this.cap = false;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCap(Boolean cap) {
        if (cap == true) {
            return "Yes";
        } else {
            return "No";
        }
    }

    void status() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Tip size: " + this.getTip());
        System.out.println("Is the cap on? " + getCap(cap));
        System.out.println("Color: " + this.color);
    }
}
