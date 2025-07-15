public class Main {
    public static void main(String[] args) {
        Box box = new Box(4); // Default constructor
        System.out.println(box.l + " " + box.h + " " + box.w);

        Box box2 = new Box(2.34, 3.45, 6.78 ); // Default constructor
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        Box box3 = new Box(box2); // Copy constructor
        System.out.println(box3.l + " " + box3.h + " " + box3.w);

        // box1.information(); // Display information of box1
        box2.information(); // Display information of box2


        BoxWeight boxWeight = new BoxWeight(); // Default constructor of BoxWeight
        System.out.println("BoxWeight - Length: " + boxWeight.l + ", Height: " + boxWeight.h + ", Width: " + boxWeight.w + ", Weight: " + boxWeight.weight);




        Box box4 = new BoxWeight(2.0, 3.0, 4.0, 5.0); // Parameterized constructor of BoxWeight
        System.out.println("BoxWeight - Length: " + box4.l + ", Height: " + box4.h + ", Width: " + box4.w);
        // System.out.print(box4.weight); // This will not work as box4 is of type Box, not BoxWeight

        // BoxWeight box5 = new Box(2, 3, 4); // Upcasting Box to BoxWeight
        // System.err.println(box5.weight);
        





        BoxPrice box6 = new BoxPrice(); // Default constructor of BoxPrice
        System.out.println("BoxPrice - Length: " + box6.l + ", Height: " + box6.h + ", Width: " + box6.w + ", Weight: " + box6.weight + ", Cost: " + box6.cost);


        BoxPrice box7 = new BoxPrice(7.89, 6.7, 5.4);
        System.out.println("BoxPrice - Length: " + box7.l + ", Height: " + box7.h + ", Width: " + box7.w + ", Weight: " + box7.weight + ", Cost: " + box7.cost);














    }
}
/*
    * Inheritance
    * Inheritance is a mechanism in Java where one class can inherit the properties and methods of another class.
    * It allows for code reusability and establishes a relationship between classes.
    *
    * Inheritance is a way to form new classes using classes that have already been defined.
    * It is a mechanism in which one class acquires the property of another class.
    *
    * Inheritance is a way to create a new class from an existing class.
 * If there is a class that is able to use he property && stuffs of other class.
 * 
 * Any class is base class. ---> parent class
 * Any class that is derived from base class. ---> child class
 * child class having access to the base class.
 * child class is inheriting properties from base class. ----> aks Inheritance
 *  * child class may also have some additional arguments of its own.
 * A child class extends a base class, inheriting its properties and methods.
 * 
 * 
 * 
 * 
 * Syntax   
 *          child_class extends base_class
 * 
 * child class will have the property of base class + 
 * it will be have some additional property of its own.
 *
 * Child child = new Child();
 * in new Child() have to initialize the property of base class also.
 * 
 * 
 * Inheritance   
 * 
 * inside child class constructor, we have to call the base class constructor.
 * we use super() to call the base class constructor
 * * super() is used to call the constructor of the parent class.
 * * super() used to initialize the value of the parent class.
 * * super() must be the first statement in the child class constructor
 * 
 * the child class it will not be able to access the private members of the parent class.
 * anything is private use in only in the that class.
 * 
 * although child class include the members of the parent class it will not be able to access the private members of the parent class.
 * 
 * if the object is directly created from the super class, it will not be able to access the members of the child class.
 * Box box1 = new Box(4); 
 * you can not access the members of BoxWeight class. eg: box1.weight (error)
 * 
 *  # The Box type Obj not be able to access the members of BoxWeight class but how is working internally and what is the reason?
 *  * # The reason is that the BoxWeight class is extending the Box class, so it inherits all the properties and methods of the Box class.
 * *  * # When you create an object of the BoxWeight class, it has all the properties and methods of the Box class,
 *       but when you create an object of the Box class, it does not have the properties and methods of the BoxWeight class. 
 * *  * # So, when you create an object of the Box class, it can only access the properties and methods of the Box class, not the BoxWeight class.
 * 
 * 
 *    Box box1 = new BoxWeight(l: 4, h: 5, w: 6, weight: 7);
 *      but you can not access the weight property of the BoxWeight class using the box1 object because it is of type Box.
 *      box 1 is actually a type of ref variable that actually determine 
 * *    box 1 is a ref type of box and it is referncing an obj of type BoxWeight.
 * 
 *      Eg: "parent Refers you as well
 *           When Parents at Parent teacher meeting  
 *           then teacher ask who are you?
 *           Parent is going to say I am the father of Pranjal
 *           Parent is referencing you".
 * 
 *      in stack memory, the box1 is a reference variable of type Box,
 *      and in heap memory, it is referencing an object of type BoxWeight.
 * *      So, when you try to access the weight property using box1, it will give an error 
 *          because box1 is of type Box and does not have access to the weight property of BoxWeight.
 *      But if you create an object of BoxWeight and assign it to a Box reference variable, 
 *          you can still access the properties of BoxWeight using type casting.
 *      
 *      when a ref to a sub class obj is assigned super class ref var 
 *      you will only have access to those part of the object that are part of the super class.
 *       This is called upcasting.
 * *      Upcasting is the process of converting a subclass reference to a superclass reference.
 * *      It allows you to treat a subclass object as if it were an object of the superclass.
 * 
 * 
 * 
 *  *     BoxWeight box5 = new Box(2, 3, 4); // Upcasting Box to BoxWeight (error)
 * *      This will not work because Box is not a subclass of BoxWeight.
 *          You are trying to a reference to a child to a parent.
 * 
 *        // There are many var in both par and child class.
 *        // you are given access to var that are in the ref type. eg: BoxWeight
 *        // hence, you should have access to weight var.
 *        // this also mean, that ones you are trying to access should be initialized.
 *        // but here, when the obj itself is of type par class, how will you call the constructor of child class?
 *        // downward motion does not have any idea about downward classes.
 *        // that is why error.
 *                BoxWeight box5 = new Box(2, 3, 4); // Upcasting Box to BoxWeight
                    System.err.println(box5.weight);
 * 
 * 
 * 
 * *super() 
 *        * whenever a subclass needs to refer to the superclass constructor
 *       * it can use the super() keyword.  
 *         
 *      class A ------> class B extends A ------> class C extends B
 *        * super() is used in C class will be refers to class B constructor.
 *        * super() is used in B class will be refers to class A constructor.
 *        * super() is used in A class will be refers to object class.
 *        so the object class is the main class in from which every other class is derived.
 * 
 *      in side the child class constructor
 *      # why we use super.weight insted of this.weight?;
 *      Ans : * because this.weight will refer to the weight variable of the child class,
 *      *       but we want to refer to the weight variable of the parent class.
 *      *       so we use super.weight to refer to the weight variable of the parent class.
 *      *       this is used to refer to the current object, while super is used to refer to the parent class.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */