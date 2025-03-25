public class Stringcompare {

    public static void compareFun(String str1 ,String str3){
        
    }
    public static void main(String args[]){
        String str1 = "Tanisha";
        String str2 = "Tanisha";

        String str3 = new String("Tanisha");

        //Interming concept 

        if(str1 == str2 ){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are different");
        }

        if(str1 == str3){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are different");
        }
      

        if(str1.equals(str3)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are different");
        }

    }
}
