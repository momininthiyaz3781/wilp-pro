// Addition.java
package com.math.operations;

public class Addition {
    public static int add(int a, int b) {
        return a + b;
    }
}

// Subtraction.java
package com.math.operations;

public class Subtraction {
    public static int subtract(int a, int b) {
        return a - b;
    }
}

// Multiplication.java
package com.math.operations;

public class Multiplication {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

// Division.java
package com.math.operations;

public class Division {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }
}

// TestArithmetic.java
import com.math.operations.Addition;
import com.math.operations.Subtraction;
import com.math.operations.Multiplication;
import com.math.operations.Division;

public class part2_task3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + Addition.add(a, b));
        System.out.println("Subtraction: " + Subtraction.subtract(a, b));
        System.out.println("Multiplication: " + Multiplication.multiply(a, b));
        System.out.println("Division: " + Division.divide(a, b));
    }
}
