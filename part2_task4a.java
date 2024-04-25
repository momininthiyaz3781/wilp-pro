//Task 4: Basic Exception Handling
  //      a) Write a program that attempts divide by zero, catches the ArthimeticExpression, and provides a return custom error message.
//

import java.util.*;
public class part2_task4a {
    public static void main(String[] args) {
        try {
            int result = divideByZero();
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static int divideByZero() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;
    }
}