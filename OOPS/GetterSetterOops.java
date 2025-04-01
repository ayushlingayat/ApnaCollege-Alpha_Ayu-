public class GetterSetterOops {
    public static void main(String[] args) {
        Pen pen_col = new Pen();  // Creating an object of Pen
        Pen pen_tip = new Pen();

        pen_col.setColor("Orange");  // Setting color

        System.out.println(pen_col.getColor());  // Getting and printing color

        pen_tip.setTip(13);

        System.out.println(pen_tip.getTip());
    }
}

// Define the Pen class separately
class Pen {
    private String color;  // Use private access modifier for encapsulation
    private int tip;

    // Getter for color
    public String getColor() {
        return this.color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for tip
    public int getTip() {
        return this.tip;
    }

    // Setter for tip
    public void setTip(int tip) {
        this.tip = tip;
    }
}


//this keyword refers to the current object 