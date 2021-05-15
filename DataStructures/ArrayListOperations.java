import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations{
    static Scanner sc = new Scanner(System.in);
    static int pos = -1;
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    public static void main(String[] args) {
        boolean iterationFlag = true;
        do {
            System.out.print(
                    "\nArrayList Operations\n\n1. Add Element\n2. Insert Element\n3. Display nth Element\n4. Display all Elements\n5. Delete Element\n6. Update Element\n7. Exit\n\n\tChoose your option : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addElement();
                    break;
                case 2:
                    insertElement();
                    break;
                case 3:
                    displayElement();
                    break;
                case 4:
                    displayAll();
                    break;
                case 5:
                    deleteElement();
                    break;
                case 6:
                    updateElement();
                    break;
                case 7:
                    iterationFlag = false;
                    break;
                default:
                    System.out.println("Invalid Input. Try again.");
            }
        } while (iterationFlag);
        System.out.println("\nOperations Ended.\n");
    }

    public static void addElement() {
        System.out.println("Enter the element : ");
        int x = sc.nextInt();
        arr.add(x);
        pos++;
        System.out.println("\nElement Added Successfully!");
        
        displayAll();
    }

    public static void insertElement() {
        if (pos != -1){
            System.out.println("Enter the element : ");
            int x = sc.nextInt();
            System.out.println("Enter the position for insertion : ");
            int position = sc.nextInt() - 1;

            if (position <= arr.size()) {
                arr.add(position, x);
                pos++;
                System.out.println("\nElement Inserted Successfully!");
            } else {
                System.out.println("\nPositon not within the current insertion range in list!");
            }
        }
        displayAll();
    }

    public static void updateElement() {
        if (pos != -1){
            
            System.out.println("Enter the position for insertion : ");
            int position = sc.nextInt() - 1;

            if (position < arr.size()) {
                System.out.println("Enter the element : ");
                int x = sc.nextInt();
                arr.set(position, x);
                System.out.println("\nElement Updated Successfully!");
            } else {
                System.out.println("\nPositon not within the current Arraylist size range!");
            }
        }
        displayAll();
    }

    public static void displayElement() {
        if (pos == -1)
            System.out.println("\nArray is Empty!");
        else {
            System.out.println("\nEnter the position : ");
            int position = sc.nextInt() - 1;
            if (position <= pos) {
                System.out.println("\nThe element is : " + arr.get(position));
            } else {
                System.out.println("\nNo element at specified position!");
            }
        }
    }

    public static void deleteElement() {
        if (pos == -1)
            System.out.println("\nArray is Empty!");
        else {
            System.out.println("Enter the position for deletion : ");
            int position = sc.nextInt() - 1;

            if (position <= pos) {

                arr.remove(position);
                pos--;
                System.out.println("\nElement Deletion Successfully!");
            } else {
                System.out.println("\nNo element at specified position to be deleted!");
            }
            displayAll();
        }
        
    }

    public static void displayAll() {
        if (pos == -1)
            System.out.println("\nArray is Empty!");
        else {
            System.out.print("\nArray List : ");
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(" " + arr.get(i));
            }
            System.out.println();
        }
    }
}