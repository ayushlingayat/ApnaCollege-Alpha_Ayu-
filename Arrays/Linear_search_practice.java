package Arrays;

public class Linear_search_practice {

    public static String string_linear_search(String string_arr[] , String key ){
        for(String i=0 ; i<string_arr.size; i++){
            if(string_arr[i] == key){
                return i;
            }
        }
        return "nhi hee";
    }
    
    public static void main(String args[]){
        String[] string_arr = {"dosa" , "idli" , "breadvada" , "vadapav"};
        String key = "dosa";

        String index = string_linear_search(string_arr , key);
    }
}
