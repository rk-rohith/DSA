/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 */

package Array;

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 20, 35, 35, 60, 100};
        int target = 2;

        int[] index =findIndex(array, target);
        System.out.println(Arrays.toString(index));
    }

    private static int[] findIndex(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int[] index = {-1, -1};
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                index[0] = mid;
                high = mid - 1;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                index[1] = mid;
                low = mid + 1;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}
