public class Substring {
    public static String subStringImplementation(String str , int start_index, int end_index){
        String substring = "";
        for(int i = start_index; i< end_index; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String args[]){
        String basic_program = "Hello World";

        String result = Substring.subStringImplementation(basic_program, 0, 5);

        System.out.println(result);
        System.out.println(basic_program.substring(0,4)); //Hell will be output
    }
}
