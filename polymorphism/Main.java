public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        Shapes triangle = new Triangle();

        shape.area(); // Calls Shapes' area method
        circle.area(); // Calls Circle's overridden area method
        square.area(); // Calls Square's overridden area method
        triangle.area(); // Calls Triangle's overridden area method
    }
}

/* Polymorphism in Java
 *   Polymorphism means "Many Ways to represent single entity or item".
 *   Poly means "Many" and Morphism means "Ways to represent". 
 *   its a greek word.
 *   if any language does not support polymorphism then it is not considered as Object Oriented Programming Language.
 *   Polymorphism is one of the four pillars of Object Oriented Programming.
 *   Java supports Polymorphism so its a Object Oriented Language.
 *   Polymorphism occurs during Inheritance.
 *   Real World Example:
 *                  A person can have many roles like Father, Son, Husband, Employee, etc.
 * 
 *   Types of Polymorphism:
 *   1. Compile Time / static Polymorphism (Method Overloading)
 *   2. Runtime / dynamic Polymorphism (Method Overriding)
 * 
 *   Method Overloading: when a class has multiple methods with the same name
 *        but different parameters (different type, number, or order of parameters), 
 *        it is called method overloading.
 *      Eg:
 *        public class MathUtils {
 *          public int add(int a, int b) {
 *            return a + b;
 *          }
 *          public double add(double a, double b) {
 *           return a + b;
 *          }
 *          public int add(int a, int b, int c) {
 *           return a + b + c;
 *          }   
 *        }
 *   Method Overriding: when a subclass provides a specific implementation of a method
 *        that is already defined in its superclass, it is called method overriding.
 *      Eg:
 *        public class Animal {
 *         void sound() {
 *         System.out.println("Animal makes a sound");
 *        }
 *        public class Dog extends Animal {
 *         @Override
 *        void sound() {
 *         System.out.println("Dog barks");
 *        }
 *        public class Cat extends Animal {
 *        @Override
 *       void sound() {
 *        System.out.println("Cat meows");
 *       }
 *     }
 * 
 * # Why Java supports Polymorphism?
 * *   1. Code Reusability: It allows methods to be reused in different contexts, reducing code duplication.
       2. Flexibility: It enables the same method to behave differently based on the object that invokes it,
                 allowing for more dynamic and flexible code.
       3. Maintainability: It makes code easier to maintain and extend, as new classes can be added without modifying existing code.
       4. Readability: It enhances code readability by allowing developers to use the same method name for similar operations,
                 making the code more intuitive
       5. Polymorphism is a key feature of Object-Oriented Programming (OOP) that allows for dynamic method resolution,
                 enabling the creation of more generic and reusable code structures.

 *  # why its name as Compile Time Polymorphism and Runtime Polymorphism?
 * *  Compile Time Polymorphism: because the method to be called is determined at compile time based on the method signature.
 * *  Runtime Polymorphism: because the method to be called is determined at runtime based on the actual object type.
 * 
 * 
 * @Override : It is an annotation in Java that indicates that 
 *          a method is intended to override a method in a superclass.
 * Override method will run when the object is created from subclass.
 * * It helps to ensure that the method signature matches the one in the superclass,
 *          preventing errors that could occur if the method is not correctly overridden.
 *
 *   
 * 
 * 
 * How Overriding works in Java?
 * if the type is the ref var as the par class but the object is created from sub class then the overridden method will run.
 * Eg: parent object = new child(); // This is called upcasting.
 * This is called dynamic method dispatch or late binding.
 *  Here which method will run is depends on the object type, not the reference type.
 * This is known as dynamic polymorphism or runtime polymorphism.
 *
 * 
 * 
 * How Java determines which method to call?
 * ANS: Java use Dynamic Method Dispatch to determine which method to call at runtime.
 *      That why it is called Runtime / dynamic Polymorphism.
 * 
 * 
 * Dynamic Method Dispatch: It is a mechanism by which a call to 
 *          an overridden method is resolved at runtime rather than compile time.
 * 
 * 
 * You can achieve polymorphism in Java using interfaces and abstract classes.
 * 
 * You can use Final keyword to prevent method overriding.
 *  You can not override a final method in a subclass.
 *  Eg: 
 *  * public class Parent {
 *      final void display() {
 *        System.out.println("This is a final method in Parent class");
 *      }
 *  }
 * *  * public class Child extends Parent {
 *       // This will cause a compile-time error
 *       void display() {
 *        System.out.println("Trying to override final method in Child class");
 *      }
 * *  }
 * *  In the above example, the `display` method in the `Parent` class is declared as final,
 * *      which means it cannot be overridden in the `Child` class.
 * 
 * Late Binding: It is a mechanism where the method to
 *               be called is determined at runtime.
 * *               In Java, late binding is achieved through method overriding,
 * 
 * Early Binding: It is a mechanism where the method to be called is determined at compile time.
 * *               In Java, early binding is achieved through method overloading.
 * 
 * if the class is final implicitly their methods are also final.
 * 
 * 
 * 
 * 
 * # can we override static methods?
 * ANS: No, static methods cannot be overridden in Java.
 *    Static methods are associated with the class itself, not
 *    with instances of the class.
 * *    When you declare a static method in a subclass with the same name and parameters as a static method in the superclass,
 *     it is called method hiding, not overriding.
 * *     The static method in the subclass hides the static method in the superclass,
 *     but it does not override it.
 *     Eg: 
 *       public class Parent {
 *        static void display() {
 *         System.out.println("This is a static method in Parent class");
 *        }
 *       public class Child extends Parent {
 *       static void display() {
 *        System.out.println("This is a static method in Child class");
 *       }
 *      }
 * *      In the above example, the `display` method in the `Child` class hides the `display` method in the `Parent` class,
 * *      but it does not override it.
 * *      When you call the `display` method using the `Parent` class, it will call the `Parent` class's static method,
 * 
 * Static method can be inherited but not overridden.
 * because it is not dependent on the object instance.
 * 
 * 
 * hence overriding depends on obj and static does not depend on obj.
 * that's why static methods cannot be overridden.
 * 
 */