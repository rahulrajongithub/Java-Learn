package OOPS.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.run();
    }
}
class A{
    public void run(){
        System.out.println("In class A.");
    }
}
class B extends A{
    public void run(){
        System.out.println("In class B.");
    }
}
