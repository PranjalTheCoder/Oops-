// import static pranjal.com.pranjal.packages.Main.message;

public class Main{
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj);



        // message();
    }   
    
}
class A{
    int val;
    String name;
    A(){
        val=10;
        name="PRANJAL";
    }
}

/*
 * if I already have Main.java And I want to create Another Main.java
 * then it will not create.
 * so Packages is help us to solve this Problem.
 * So Packages are just Container for the classes.
 *  it is use to keep the classname compartment wise.
 * 
 * Package is just a Folder. that allow you to create multiple 
 * Compartment and folder for your classes.
 * 
 * Packages are stored in hierarchial manner.
 * it is useful like naming and visibility control.
 * same file in multiple packages is some other usecases.
 * 
 * 
 * package com.pranjal.packages.a ---> this mention that packages where your file lies.
 * 
 * 
 * if the company name is morgan.com then your packages should be com.morgan in oposite manner.
 * 
 * # When we create packages for a file and run the file how does Java know in which file look for packages.
 * 
 * 
 * 
 */