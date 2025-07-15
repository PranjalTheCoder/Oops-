public class BoxWeight extends Box {
   double weight;

   public BoxWeight() {
       super(); // Call the default constructor of Box
       this.weight = 1; // Default weight
   }

   public BoxWeight(double l, double h, double w, double weight) {
       super(l, h, w); // Call the parameterized constructor of Box
       this.weight = weight;
   }

    public BoxWeight(BoxWeight old) {
        super(old); // Call the copy constructor of Box
        this.weight = old.weight; // Copy the weight
    }

   
    
}



/*
 * The Copy Constructor is only taking a Box type you are pass a BoxWeight type.
 * Does BoxWeight Type have access to all the Box Type
 *  Yes It has access to all the Box Type.
 *
 * 
 * 
 * 
 */