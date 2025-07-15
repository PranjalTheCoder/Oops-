public class BoxPrice extends BoxWeight {
    double cost;

    public BoxPrice() {
        super();
        this.cost = 100; // Default cost
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight); // Call the parameterized constructor of BoxWeight
        this.cost = cost;
    }

    public BoxPrice(BoxPrice old) {
        super(old); // Call the copy constructor of BoxWeight
        this.cost = old.cost; // Copy the cost
    }
    
}
