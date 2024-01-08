/***
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * For Example, For the input string "()", the output should be true because the parentheses are closed in the correct order and have corresponding open and close brackets.
 * For the input string "()[]{}", the output should be true for the same reasons.
 * For the input string "(]", the output should be false because the brackets are not closed in the correct order.
 * The constraints are that the length of the input string is between 1 and 10,000, and the string consists only of the characters '(', ')', '{', '}', '[' and ']'.
 */
package main.java.codingproblems.strings;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "({[]}){";
        boolean result1 = isValidParentheses(s);
        System.out.println(result1);

        String s1 = "({[]})";
        boolean result2 = isValidParentheses(s1);
        System.out.println(result2);

        String s2 = "}";
        boolean result3 = isValidParentheses(s2);
        System.out.println(result3);
    }

    /**
     * 1. Iterate through the string
     * 2. If the character is an opening bracket then push it to the stack
     * 3. If the character is a closing bracket, it checks if the stack is empty. If it is, the method returns false, indicating that the parentheses are not balanced
     * 4. If the character is a closing bracket then pop the top element from the stack
     * 5. If the popped element is not the matching opening bracket then return false
     * 6. If the popped element is the matching opening bracket then continue iterating through the string
     * 7. If the stack is empty then return true
     */
    private static boolean isValidParentheses(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] == '(') || (charArray[i] == '{') || (charArray[i] == '[')) {
                stack.push(charArray[i]);
            } else {
                // If the stack is empty then return false
                if(stack.isEmpty()){
                    return false;
                }
                if ((charArray[i] == ')' && stack.pop() != '(') || (charArray[i] == '}' && stack.pop() != '{')
                        || (charArray[i] == ']' && stack.pop() != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}
