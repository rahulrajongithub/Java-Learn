package OOPS.Inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Models a = new Models();
        System.out.println("Vehicle Details");
        a.vehicleType();
        a.brandName();
        a.modelName();
    }
}

class Cars{
    public void vehicleType(){
        System.out.println("\tType : Car");
    }
}
class Brands extends Cars{
    public void brandName(){
        System.out.println("\tBrand : BMW");
    }
}
class Models extends Brands{
    public void modelName(){
        System.out.println("\tModel : M3");
    }
}