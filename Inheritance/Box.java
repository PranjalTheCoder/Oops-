public class Box {
    double l,h,w;   
    Box(){
        super(); // Call the default constructor of Object class
        this.h = 1;
        this.l = 1;
        this.w = 1;
    } 
    //cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
       this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void information(){
        System.out.println("Length: " + l);
        System.out.println("Height: " + h);
        System.out.println("Width: " + w);
    }

}

/*
 * Types of Constructor
 * * 1. Default Constructor
 * * 2. Parameterized Constructor
 * * 3. Copy Constructor
 * * Default Constructor: A constructor that does not take any parameters and initializes the object with default values.
 * * * Parameterized Constructor: A constructor that takes parameters to initialize the object with specific values.
 * * * Copy Constructor: A constructor that creates a new object as a copy of an existing object.
 * * *
 * Types of Inheritance
 * * 1. Single Inheritance: A class inherits from one superclass.
 * * 2. Multiple Inheritance: A class inherits from multiple superclasses (not supported in Java).
 * * 3. Multilevel Inheritance: A class inherits from a superclass, which in turn inherits from another superclass.
 * * 4. Hierarchical Inheritance: Multiple classes inherit from a single superclass.
 * * 5. Hybrid Inheritance: A combination of two or more types of inheritance.
 * 
 *  1. Single Inheritance
 *   class A ------> class B
 *  2. Multilevel Inheritance
      class A ------> class B ------> class C
    3. Hierarchical Inheritance
      class A ------> class B
      class A ------> class C
    4. Multiple Inheritance (not supported in Java)
      class A ------> class B
      class A ------> class C
      class B ------> class D
 * 
 */