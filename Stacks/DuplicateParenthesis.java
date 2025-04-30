import java.util.*;

public class DuplicateParenthesis {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ')') {
                // Push all characters except closing parenthesis
                s.push(ch);
            } else {
                // On encountering ')', check for duplicate
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (!s.isEmpty()) {
                    s.pop(); // pop the opening '('
                }

                if (count < 1) {
                    return true; // Duplicate found
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {
        String str1 = "((a + b))"; // true -> duplicate
        String str2 = "(a - b)";   // false -> no duplicate

        System.out.println("str1 has duplicate parentheses? " + isDuplicate(str1));
        System.out.println("str2 has duplicate parentheses? " + isDuplicate(str2));
    }
}
