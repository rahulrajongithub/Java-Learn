package OOPS.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading test = new MethodOverloading();
        test.display(10);
        test.display(12.454);
        test.display("Hello World!");
        test.display("Rahul's World!", 99, 0.9867);
    }
    public void display(int a){
        System.out.println("Initiated display method with integer parameters");
    }
    public void display(double a){
        System.out.println("Initiated display method with double parameters");
    }
    public void display(String a){
        System.out.println("Initiated display method with String parameters");
    }
    public void display(String a, int x, double y){
        System.out.println("Initiated display method with Multiple parameters");
    }
}
