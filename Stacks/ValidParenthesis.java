import java.util.*;

public class ValidParenthesis {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            //opening condition 
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else{
                //close case
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                    s.pop(); //successful pair form hua tab pop karre hum idar okk
                }
                else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        String str = "(({})[]";
        System.out.println(isValid(str));
    }
}
