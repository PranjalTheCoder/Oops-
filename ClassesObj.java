public class ClassesObj {
    public static void main(String[] args) {
        
    }
}
/*
 * Class is a named of group, properties and functions.
 * Class is started with Capital latter
 * Human Class is also a Group Of Properties and Functions
 * Theses are the Properties every Human should have
 * Class is an template of an Object
 * Object is an instance of class
 * Class helps us in defining this data type
 * When you create an object of class you actually create an instance of that class.
 * instance means a Physical stuffs of this class
 * Follow this Class template and create an instance out of it
 * that is an object
 * class is Logical Construct
 * object is Physical Reality That is actually occupying space in the memory
 * Object arr, arrayList
 * 
 * 
 * Object are Three Properties
 * 1. state of the object -  val from its data type
 * 2. Identity of the Object - whether one object is diff from other
 * 3. Behavour of the object - effect of the data type operations
 * 
 * 
 * object are store in heap mem
 * ref var are store in the stack mem
 * 
 * using '.' operator you can access the property of the class
 * the '.' operator basically link the ref var wih the name of the instance var
 *  var inside the obj is the instance var . outside the method but inside the class
 * '.' is a separator
 * 
 * so in order to create an object we use new keyword
 *  
 *  Student student1 // declare the object
 * stored in stack memory
 *  
 * 
 * when student or an object is not initialize bia default its value is null. for premitive it may be differnet
 * 
 * new operator dynamically allot memory at run time. and return a ref to it
 *  student1 = new Student(); // and this ref is stored in this student1 var
 *  hence all class obj in java must be allocated dynamically.
 * 
 * Student student1 = new Student();
 * Student student1 this happens in compile time
 * new Student() this happens in run time
 * 
 * after compilation code has been converted to before checking all errors
 * your prog has been running that is  when memory allot its a runtime memory
 * that is known as Dynamically mem allocation
 * 
 * 
 *  obj is basically ref var which is pointing to the obj
 * the original obj in the heap
 * 
 * when you create an instance of the class it can be instantiated.
 * via default value of object when it is not initialize is null.
 * 
 * A constructor is basically define what happens when your obj will be created.
 * constructor is basically special type of function inside the class.
 * 
 * when you don;t have the constructor inside the class then default constructor may be call
 * 
 * These two methods inside student class gives same result
 * void greeting () {
 *  System.out.println("Hello!, My Name is " + name);
 * }
 * void greeting () {
 *  System.out.println("Hello!, My Name is " + this.name);
 * }
 * 
 * Then Why are you using this keyword
 * whenever you try to access any particular item of the class via its object
 * obs every single item is specific to this obj
 * in order to do that we use this variable
 * 
 * whenever you say ref var name . whatever inside the class this si replace with the name of the ref var.
 *  
 * This is replace with this with the name of the ref var itself.
 * this.name-----> Pranjal.name
 * this.age------> Pranjal.age
 * this will be replace with the current object
 * 
 * 
 * You can call a constructor from another Constructor as well
 * Using THIS keyword
 * Student(){
 *      this (13, "default Person", 100.09f);
 * }
 * 
 * internally this something like
 * this (13, "default Person", 100.09f);
 *              |
 *              |
 * Student (13, "default Person", 100.09f);
 * 
 * 
 * # Why We don't use new keyword for creating like primitive data type (int, boolean, char)
 * in java primitive data type are not implemented as Object hence they are stored in the stack memory.
 * there why primitive are stored in the stack memory.
 * in Python there are no primitive 
 * in python a=10; // here 10 is an object
 * 
 * #Why we don't use new keyword.
 * they are implemented like normal var to increase efficiency to make it more fast.
 * because into the heap mem have a big big mem that all stuff will be slower that's why python is slow language.
 * 
 * 
 * 
 * Student one = new Student()
 * Student two = one
 * THe assignment of two does not allocate any memory
 * When you assign one object ref var to another obj ref var
 * You are not creating a copy or anything
 * you are making the copy of ref var only
 * 
 * 
 * Garbage Collection:
 * 
 * When garbage Collection is destroyed.
 * You need to be perform some sort of an action.
 * Java Provide such thing as Finalization.
 * in c++ there is destructor where you free the memory. manually you free mem.
 * in Java it is automatically 
 * Java give you a way performing some action 
 * 
 * 
 * 
 * 
 * 
 * 
 /*

Wrapper Classes:
 *  THere is also a way to creating as new keyword that's called it Wrapper classes.
 * you can also written 
 * int a=10;// that will create like primitive stuff.
 * Integer a=new Integer(10); // that will create like object
 * but it does not require
 * 
 * Wrapper Class are basically converting a character into an object.
 * No swap operation work because Java does not any Pass By Reference
 * Everything passes as a Pass by Value(in primitive)(specially in java)
 * 
 * But When you Pass Object Reference value is Passed.
 * swap(int a, int b) -------> swap(Integer a, Integer b)
 * still not swap because Integer is final
 * 
 * final is a KeyWord Using that keyword we can prevent to modify the content
 * final var have to be always initialize while declare it. only when the instance var are primitive data type. not the ref type obj and stuff.
 * 
 * final int b---->error
 * final int b=5---->correct
 * 
 * 
 * because the instance var is the ref type has a final modifier behind it.
 * The val of ref var will never change
 * it will be ref to the same object.
 * 
 * but the val of the object can change.
 * 
 * Immutability
 * 
 *  final int b=2 ----> correct
 *  final student s1 = new student() ---> wrong 
 * 
 *  when a non primitive is final you can not reassign it
 *  s1.name="Pranjal"; -----> it works
 *  s1=new studnet("new obj"); ----> error
 * 
 * 
 * 
 * 
 */