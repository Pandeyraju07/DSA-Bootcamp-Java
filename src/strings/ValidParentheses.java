package strings;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Concept: stack matching for characters.
 *
 * TOP INTERVIEW FAVORITE:
 *   Valid Parentheses — check if brackets are correctly matched.
 *
 * Example:
 *   "()[]{}" → true
 *   "(]"     → false
 *   "([)]"   → false
 *   "{[]}"   → true
 *
 * Idea:
 *   push opening brackets
 *   on closing bracket, top must be its matching open
 *   at end stack must be empty
 *
 * Dry run "{[]}":
 *   '{' push
 *   '[' push
 *   ']' match '[' pop
 *   '}' match '{' pop
 *   empty → true
 *
 * Time: O(n)   Space: O(n)
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println("()[]{} → " + isValid("()[]{}"));
        System.out.println("(]     → " + isValid("(]"));
        System.out.println("{[]}   → " + isValid("{[]}"));
    }

    private static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (!matches(open, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}
