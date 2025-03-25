

public class StringBuilderExample {  
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");  // Creating StringBuilder object

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);  
        }

        System.out.println(sb.length());  // Output: 26
        System.out.println(sb);  // Output: abcdefghijklmnopqrstuvwxyz
    }
}
