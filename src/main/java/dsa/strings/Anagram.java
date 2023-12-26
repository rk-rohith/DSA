/***
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * For example, given the strings s = "anagram" and t = "nagaram", the function should return true, as the two strings are anagrams of each other.
 * However, for the strings s = "rat" and t = "car", the function should return false, as they are not anagrams of each other.
 */
package main.java.dsa.strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        boolean result = isAnagram(s1, s2);
        System.out.println(result);
    }

    /**
     * 1. Checks if the input strings have the same length. If the length of the strings are not equal then return false
     * 2. Converts the strings to character arrays and sorts them. This is done to make sure that the characters are in the same order
     * 3. Compares the sorted arrays to determine if the input strings are anagrams.
     * 4. If the arrays are equal, the strings are anagrams, and the method returns true; otherwise, it returns false
     */
    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            return Arrays.equals(s1Array, s2Array);
        }
    }
}
