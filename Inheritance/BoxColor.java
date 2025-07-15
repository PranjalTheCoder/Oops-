public class BoxColor extends BoxWeight {
    String color;

    public BoxColor() {
        super(); // Call the default constructor of BoxWeight
        this.color = "White"; // Default color
    }

    public BoxColor(double l, double h, double w, double weight, String color) {
        super(l, h, w, weight); // Call the parameterized constructor of BoxWeight
        this.color = color;
    }

    public BoxColor(BoxColor old) {
        super(old); // Call the copy constructor of BoxWeight
        this.color = old.color; // Copy the color
    }

    public BoxColor(double side, double weight, String color) {
        super(side, weight); // Call the cube constructor of BoxWeight
        this.color = color;
    }
    
}

/*
 * Example of Hierarchical inheritance
 */