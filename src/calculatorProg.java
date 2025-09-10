import java.util.*;

public class calculatorProg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter the operator (+, -, *, /, %, x to exit):");
            char op = in.next().trim().charAt(0);

            // Exit condition FIRST
            if (op == 'x' || op == 'X') {
                System.out.println("Exiting calculator...");
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println("Answer: " + ans);
            } else {
                System.out.println("Invalid operation");
            }
        }
    }
}
