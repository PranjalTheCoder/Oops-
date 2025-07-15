public class Main {
    
}

/*Encapsulation: 
    Wrapping data (variables) and methods (functions) into a single unit, typically a class.
    It restricts direct access to some of the object's components, 
    which can prevent the accidental modification of data.
    it hides the data into single unit so that can be protected from outside interference and misuse.
    Encapsulation is achieved using access modifiers (private, protected, public).

 * 
 * Abstraction: "Hiding the unnecessary details and showing only the essential information of the object."
    Hiding the complex implementation details and showing only the essential features of the object.
    It allows focusing on what an object does instead of how it does it.
    In Java, abstraction can be achieved using abstract classes and interfaces.
 * 
 * Abstraction is solving an designing level problem.
 * Encapsulation is solving an implementation level problem.
 * 
 * 
 * #Encapsulation
 *      Eg: 
 *      public class Person {
 *        private String name; // private variable
 *        public string getName() { // public getter method
 *          return name;
 *        }
 *        public void setName(String name) { // public setter method
 *          this.name = name;
 *       }
 *      }
 * *      In the above example, the `name` variable is encapsulated within the `Person` class.
 * *      It is private, meaning it cannot be accessed directly from outside the class.
 * *      The `getName` and `setName` methods provide controlled access to the `name` variable.
 * 
 * 
 * #Abstraction
 *      Eg:
 *      abstract class Animal {
 *       abstract void makeSound(); // abstract method
 *      }
 *      class Dog extends Animal {
 *       void makeSound() {
 *        System.out.println("Bark");
 *       }
 *      }
 * *      class Cat extends Animal {
 *       void makeSound() {
 *       System.out.println("Meow");
 *      }
 * *      }
 * *      In the above example, the `Animal` class is an abstract class with an abstract method `makeSound`.
 * *      The `Dog` and `Cat` classes extend the `Animal` class and provide their own implementations of the `makeSound` method.
 * *      This allows us to define a common interface for all animals while hiding the specific implementation details.
 * *
 * 
 * 
 * 
 * 
 * Data Hiding:  (achieved by a getter and setter methods)
 *  It is a concept of restricting access to the internal state of an object.
 * *  It is achieved by using access modifiers (private, protected, public).
 * *  Data hiding is a key aspect of encapsulation, as it prevents external code from directly accessing and modifying the internal state of an object.
 * *  For example, if a class has a private variable, it can only be accessed through public methods (getters and setters) defined in that class.
 *  *  This ensures that the internal state of the object is protected from unintended modifications and provides a controlled way to access and modify the data.
 *     Eg: 
 *      public class BankAccount {
 *      private double balance; // private variable
 *      public double getBalance() { // public getter method
 *         return balance;
 *      }
 *      public void deposit(double amount) { // public method to modify balance
 *         if (amount > 0) {
 *          balance += amount;
 *         }
 *      }
 *      public void withdraw(double amount) { // public method to modify balance
 *        if (amount > 0 && amount <= balance) {
 *         balance -= amount;
 *        }
 *      }
 * *      }
 * *      In the above example, the `balance` variable is private, meaning it cannot be accessed directly from outside the `BankAccount` class.
 * * *      The `getBalance`, `deposit`, and `withdraw` methods provide controlled access to the `balance` variable.
 *  
 * 
 *      DATA HIDING vs ENCAPSULATION:
 * *      DATA HIDING is focused on data security and preventing unauthorized access.
 * *      ENCAPSULATION is focused on hiding the complexity of the system.
 * *        ENCAPSULATION is a subprocess of DATA HIDING.
 *     
 * 
 * 
 */