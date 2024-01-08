/***
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * For example, given the input array [2, 7, 11, 15] and a target of 9, the output should be [0, 1] because nums[0] + nums[1] equals 9.
 * For example, given the input array [3,2,4] and a target of 6, the output should be [1, 2] because nums[1] + nums[2] equals 6.
 */


package main.java.codingproblems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    /**
     1. Add all the elements to the map with key as element and value as index of the element
     2. Iterate through the array and find the difference between target and current element
     3. Check if the difference is present in the map and the index of the difference is not equal to the current index
     4. If the difference is present in the map and the index of the difference is not equal to the current index then return the current index and the index of the difference
     5. If the difference is not present in the map then return null
    */
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            result.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diffVal = target - nums[i];
            if (result.containsKey(diffVal) && result.get(diffVal) != i) {
                return new int[]{i, result.get(diffVal)};
            }

        }
        return null;
    }
}
