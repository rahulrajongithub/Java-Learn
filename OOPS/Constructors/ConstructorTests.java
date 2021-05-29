package OOPS.Constructors;

public class ConstructorTests {
    public static void main(String[] args) {
        System.out.println("Creating Object for class A");
        A a = new A();
        System.out.println("Creating Object for class B");
        B b = new B(100, "Hello World!");
    }
}

class A{
    private int a;
    A(){
        a = 10;
        System.out.println("A = " + this.a);
    }
}

class B{
    private int a;
    private String str;
    B(int a, String str){
        this.a = a;
        this.str = str;
        System.out.println("A = " + this.a);
        System.out.println("String  = " + this.str);
    }
}
