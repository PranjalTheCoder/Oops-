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
 * * 5. Hybrid Inheritance: A combination of two or more types of inheritance.(combination of single and multiple inheritance)
 *                          Since Java we does not have multiple inheritance. so we can not use hybrid inheritance.
 * 
 *  1. Single Inheritance
 *   class A ------> class B
 *  2. Multilevel Inheritance
      class A ------> class B ------> class C
    3. Hierarchical Inheritance
      class A ------> class B
      class A ------> class C
    4. Multiple Inheritance (not supported in Java)
      class A ------> class C
      class B ------> class C
    *  5. Hybrid Inheritance (not supported in Java)
      class A ------> class B
      class A ------> class C
      class B ------> class D
      class C ------> class D
    
 * in Multiple Inheritance we can not use in Java.
 * because it creates ambiguity.
 * suppose class A ------> class C
           class B ------> class C
           here class A has n=10 and class B has n=20
           so which n will be used in class C.
           C obj = new C();
           System.out.println(obj.n); // 10 or 20
 *  Solution is to use interface.
 *  interface defines a Class without implementation.
 * 
 * 
 * *  interface A{
 *       int n = 10; // by default it is public static final
 *       void method(); // by default it is public abstract
 *   }
 * *   interface B{
 *      int n = 20; // by default it is public static final
 *      void method(); // by default it is public abstract
 *   }
 *   class C implements A, B{
 *      public void method(){
 *         System.out.println("Method of C");
 *      }
 *      public void methodA(){
 *         System.out.println("Method of A");
 *      }
 *      public void methodB(){
 *        System.out.println("Method of B");
 *      }
 *      public void display(){
 *        System.out.println("Value of n from A: " + A.n);
 *        System.out.println("Value of n from B: " + B.n);
 *      }
 *  }
 * 
 * 
 * 
 * 
 * but you can't  use this
 * class A extends A // This is a Cyclic Inheritance and not allowed in Java.
 * 
 * A class can not be its own superclass.
 * 
 * 
 */