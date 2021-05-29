package OOPS.AccessModifiers.PackageA;

class ChildOfSource extends Source {
    public static void main(String[] args) {
        b = "This is a public data member. Only Accessible within the same package.";
        c = "This is a protected data member. Only Accessible within the same package and outside the package through child class.";
        d = "This is a default data member. Can be accessed from within the class, outside the class, within the package and outside the package.";
        System.out.println(d  + "\n" + c + "\n" + b);
    }
}
