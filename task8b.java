//(b) Create a recursive function to find the nth element of a Fibonacci sequence and store the first n elements in an array.



public class task8b {
        static int fib(int n) {
            if (n <= 1)
                return n;
            return fib(n - 1) + fib(n - 2);
        }

        public static void main(String args[]) {
            int n = 10;
            for (int i = 0; i < n; i++) {
                System.out.print(fib(i) + " ");
            }
        }
    }
