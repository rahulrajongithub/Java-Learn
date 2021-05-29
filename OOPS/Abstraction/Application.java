package OOPS.Abstraction;

public class Application {
    public static void main(String[] args) {
    Salary s = new Salary("Mohd Mohtashim", "Senior Systems Engineer", 3, 56000.00);
    System.out.println("Call mailCheck using Salary reference --");
    s.mailCheck();
    }
}
