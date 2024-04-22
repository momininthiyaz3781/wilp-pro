
//Given an array of integers, write a program that finds if there are two numbers that add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// Optimize the solution for time complexity.


import java.util.Arrays;

public class task5 {
    public static boolean funcSum(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);

        // Initialize two pointers
        int left = 0;
        int right = nums.length - 1;

        // Move pointers towards each other until they meet
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(funcSum(nums, target));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println(funcSum(nums2, target2));


        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println(funcSum(nums3, target3));


        int[] nums4 = {1, 2, 3, 4, 5};
        int target4 = 10;
        System.out.println(funcSum(nums4, target4));
    }
}
