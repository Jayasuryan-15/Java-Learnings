package Problems;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char c : s.toCharArray()) {
            if (bracketMap.containsValue(c)) {
                stack.push(c);
            } else if (bracketMap.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != bracketMap.get(c)) {
                    return false;
                }
            } else {

                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        String s1 = "()";
        System.out.println(solution.isValid(s1));

        String s2 = "()[]{}";
        System.out.println(solution.isValid(s2));

        String s3 = "(]";
        System.out.println(solution.isValid(s3));
    }
}

