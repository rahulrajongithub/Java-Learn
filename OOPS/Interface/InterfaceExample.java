package OOPS.Interface;

public class InterfaceExample implements TestInterface {
    public void print(){
        System.out.println("Inside the print method.");
        System.out.println("The value of the static integer is " + x);
    }
    public static void main(String[] args) {
        InterfaceExample test = new InterfaceExample();
        test.print();
    }
}

interface TestInterface {
    static int x = 10;
    void print();
}