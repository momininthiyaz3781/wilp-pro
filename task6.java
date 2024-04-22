//Write a recursive function named SumArray that calculates and returns the sum of elements in an array, demonstarte with example.


public class task6{
    public static int SumArray(int[] A, int N) {
        if (N <= 0) {
            return 0;
        }
        return  SumArray(A, N - 1) + A[N-1];
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum =  SumArray(array, array.length);
        System.out.println("Sum of elements in the array is: " + sum);
    }


}