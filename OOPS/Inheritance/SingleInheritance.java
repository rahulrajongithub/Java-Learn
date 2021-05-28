package OOPS.Inheritance;

/**
 * SingleInheritance
 */
public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Ruby", "Indian");
        dog1.display();
    }
}
class Animal{
    String type;
    int legCount;
}
class Dog extends Animal{
    String petName;
    String dogBreed;

    Dog(String petName, String dogBreed){
        this.petName = petName;
        this.dogBreed = dogBreed;
        this.type = "House Pet";
        this.legCount = 4;
    }

    public void display(){
        System.out.println("\n\tAnimal : Dog\n\tName : " + this.petName + "\n\tType : " + this.type + "\n\tlegs : " + this.legCount + "\n\tBreed : " + this.dogBreed);
    }
}