import java.util.*;

public class LinkedListOperations {
    static Scanner sc = new Scanner(System.in);
    static LinkedList<Integer> ll = new LinkedList<Integer>();
    static int count = 0;

    public static void main(String[] args) {
        boolean iterationFlag = true;
        do {
            System.out.print(
                    "\nLinked List Operations\n\n1. Add Element\n2. Insert Element\n3. Display nth Element\n4. Display all Elements\n5. Delete Element\n6. Update Element\n7. Exit\n\n\tChoose your option : ");
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
                    System.out.println("\nInvalid Input. Try again.");
            }
        } while (iterationFlag);
        System.out.println("\nOperations Ended.\n");
    }

    public static void addElement() {
        System.out.print("\nEnter the element : ");
        int x = sc.nextInt();
        ll.add(x);
        count++;
        System.out.println("\nElement added successfully.");
        displayAll();
    }

    public static void insertElement() {

        System.out.print("\nEnter the element : ");
        int x = sc.nextInt();
        System.out.print("\nEnter the position : ");
        int pos = sc.nextInt();

        if (pos < count + 1) {
            ll.add(pos - 1, x);
            count++;
            System.out.println("\nElement insertion successfully.");
        } else {
            System.out.println("\nPosition out of bounds!");
        }

        displayAll();
    }

    public static void displayAll() {
        if (count <= 0)
            System.out.println("\nList Empty!");
        else {
            System.out.print("\nLinked List : ");
            System.out.println(ll);
        }

    }

    public static void displayElement() {
        if (count <= 0)
            System.out.println("List Empty!");
        else {
            System.out.print("\nEnter the position : ");
            int pos = sc.nextInt();

            if (pos <= count)
                System.out.print("\nThe elements is : " + ll.get(pos - 1));
            else
                System.out.println("\nPosition out of bounds!");
        }
    }

    public static void deleteElement() {
        if (count <= 0)
            System.out.println("List Empty!");
        else {
            System.out.print("\nEnter the position : ");
            int pos = sc.nextInt();

            if (pos <= count) {
                ll.remove(pos - 1);
                count--;
                System.out.println("\nDeletion Successful!");
            } else
                System.out.println("\nPosition out of bounds!");
            displayAll();
        }
    }

    public static void updateElement() {
        if (count <= 0)
            System.out.println("List Empty!");
        else {
            System.out.print("\nEnter the position : ");
            int pos = sc.nextInt();

            if (pos <= count) {
                System.out.print("\nEnter the element : ");
                int x = sc.nextInt();
                ll.set(pos - 1, x);
                System.out.println("\nElement updated successfully.");
            } else
                System.out.println("\nPosition out of bounds!");
            displayAll();
        }
    }
}