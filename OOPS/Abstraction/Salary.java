package OOPS.Abstraction;

public class Salary extends Employee{
    private double salary;

    public Salary(String name, String position, int number, double salary) {
        this.name = name;
        this.position = position;
        this.number = number;
        setSalary(salary);
     }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
    public String getName() {
        return name;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
           salary = newSalary;
        }  
    }

    public double getSalary() {
        return salary;
    }

    public void mailCheck() {
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }
}
