class A {
    public A(double number, int value) {
        System.out.println("the constructor of A has been called");
    }
}

class B extends A {
    public B(double number, String message) {
        
        super(number, (int) number); 
        System.out.println("the constructor of B has been called");
    }
}

public class Main1 {
    public static void main(String[] args) {
        A a = new A(12.3, 430);  // This should print: "the constructor of A has been called"
        B b = new B(-12.31, "hello");  // This should print both constructor messages

        A bInDisguise = new B(1002.013, "world");
        bInDisguise.method2();

        System.out.println(b.bField + " " + bInDisguise.bField);
    }
}
