import java.util.Scanner;
import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the brackets : ");
        String brackets = sc.nextLine();

        if (brackets.length() % 2 != 0)
            System.out.println("\nOdd number of brackets are always imbalanced.");
        else
            System.out.println("\nThe brackets are " + checkBalanced(brackets) + ".");
    }

    public static String checkBalanced(String brackets) {
        Stack<Character> stack = new Stack<Character>();
        char c;

        for (int i = 0; i < brackets.length(); i++) {
            c = brackets.charAt(i);
            if (c == '(')
                stack.push(c);
            else {
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    return "imbalanced";
                }
            }
        }

        if (!stack.empty())
            return "imbalanced";

        return "balanced";
    }
}
