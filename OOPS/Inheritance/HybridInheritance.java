package OOPS.Inheritance;

public class HybridInheritance {
    public static void main(String[] args) {
        BC right = new BC();
        AC left = new AC();

        left.firstMethod();
        right.firstMethod();
        left.leftHierarchy();
        right.rightHierarchy();
        left.leftLeaf();
        right.rightLeaf();
    }
}
class A{
    public void firstMethod(){
        System.out.println("This is from the Root class.");
    }
}
class AB extends A{
    public void leftHierarchy(){
        System.out.println("Left Branch initiated.");
    }
}
class AC extends AB{
    public void leftLeaf(){
        System.out.println("Left Leaf Reached.");
    }
}
class BB extends A{
    public void rightHierarchy(){
        System.out.println("Right Branch initiated.");
    }
}
class BC extends BB{
    public void rightLeaf(){
        System.out.println("Right Leaf Reached.");
    }
}