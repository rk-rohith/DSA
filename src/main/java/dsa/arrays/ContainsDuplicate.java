/**
 * Check if there are any duplicate values in a given integer array. If there are any duplicates, the function should return true; otherwise, it should return false.
 * For example, given the input array [1, 2, 3, 1], the function should return true because the value 1 appears more than once in the array.
 * Given the input array [3, 1], the function should return false because every value in the array is distinct.
 */
package main.java.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    /** 1. Add all the elements to the set
     * 2. Iterate through the array and check if the element is present in the set
     * 3. If the element is present in the set then return true
     * 4. If the element is not present in the set then add the element to the set
     * 5. If the iteration is complete then return false
     */
    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueValues = new HashSet<>(); // HashSet is used to store unique values in the set, it does not allow duplicates
        for (int i = 0; i < nums.length; i++) {
            if (uniqueValues.contains(nums[i])) {
                return true;
            }
            uniqueValues.add(nums[i]);
        }
        return false;
    }
}
