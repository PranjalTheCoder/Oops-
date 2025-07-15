import static com.pranjal.packages.Main.message;

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj);

        message(); // call to the imported static method
    }   
}

class A {
    int val;
    String name;
    A(){
        val = 10;
        name = "PRANJAL";
    }
    public String toString() {
        return name + " : " + val;
    }
}
