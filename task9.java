//Write a method that takes two strings, concatenates them, reverses the result, and then extracts the middle substring of the given length. Ensure your method handles edge cases, such as an empty string or a substring length larger than the concatenated string.

public class task9 {

    public static String manipulateStrings(String str1, String str2, int desiredLength) {
        // Concatenate the input strings
        String concatenated = str1.concat(str2);

        // Reverse the concatenated string
        StringBuilder reversed = new StringBuilder(concatenated).reverse();

        // Calculate the middle index
        int middleIndex = reversed.length() / 2;

        // Handle edge cases
        if (reversed.isEmpty() || desiredLength > reversed.length()) {
            return "Invalid input. Please provide non-empty strings and a valid substring length.";
        }

        // Extract the middle substring
        int startIndex = middleIndex - (desiredLength / 2);
        int endIndex = startIndex + desiredLength;
        return reversed.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        int desiredLength = 3;

        String result = manipulateStrings(str1, str2, desiredLength);
        System.out.println("Result: " + result);
    }
}
