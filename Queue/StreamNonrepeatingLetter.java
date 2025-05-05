import java.util.*;

public class StreamNonrepeatingLetter {

    public static void printNonRepeating(String str) {
        int[] freq = new int[26]; // frequency array for 'a' to 'z'
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            // Remove characters from the front of the queue until the front is non-repeating
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // Print the current first non-repeating character
            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String args[]) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
