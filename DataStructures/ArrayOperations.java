import java.util.Scanner;

public class ArrayOperations {
    static Scanner sc = new Scanner(System.in);
    static int size;
    static int pos = -1;
    static int[] arr;

    public static void main(String[] args) {

        boolean iterationFlag = true;
        System.out.print("Enter the size of the Array : ");
        size = sc.nextInt();
        arr = new int[size];
        do {
            System.out.print(
                    "\nArray Operations\n\n1. Add Element\n2. Insert Element\n3. Display nth Element\n4. Display all Elements\n5. Delete Element\n6. Exit\n\n\tChoose your option : ");
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
                    iterationFlag = false;
                    break;
                default:
                    System.out.println("Invalid Input. Try again.");
            }
        } while (iterationFlag);
        System.out.println("\nOperations Ended.\n");
    }

    public static void addElement() {
        if (pos == size - 1)
            System.out.println("\nArray is full. Delete some elements!");
        else {
            System.out.println("Enter the element : ");
            int x = sc.nextInt();
            arr[pos + 1] = x;
            pos++;
            System.out.println("\nElement Added Successfully!");
        }
        displayAll();
    }

    public static void insertElement() {
        if (pos == size - 1)
            System.out.println("\nArray is full. Delete some elements!");
        else {
            System.out.println("Enter the element : ");
            int x = sc.nextInt();
            System.out.println("Enter the position for insertion : ");
            int position = sc.nextInt() - 1;

            if (position <= size) {

                for (int i = pos; i >= position; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[position] = x;
                pos++;
                System.out.println("\nElement Inserted Successfully!");
            } else {
                System.out.println("\nPositon not within the given size limit!");
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
                System.out.println("\nThe element is : " + arr[position]);
            } else {
                System.out.println("\nNo element at specified position!");
            }
        }
    }

    public static void displayAll() {
        if (pos == -1)
            System.out.println("\nArray is Empty!");
        else {
            System.out.print("\nThe elements are : ");
            for (int i = 0; i <= pos; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }
    }

    public static void deleteElement() {
        if (pos == -1)
            System.out.println("\nArray is Empty!");
        else {
            System.out.println("Enter the position for deletion : ");
            int position = sc.nextInt() - 1;

            if (position <= pos) {

                for (int i = position; i < pos; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[pos] = 0;
                pos--;
                System.out.println("\nElement Deletion Successfully!");
            } else {
                System.out.println("\nNo element at specified position to be deleted!");
            }
        }
        displayAll();
    }
}










/*



*/