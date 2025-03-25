class Stringfun{
      public static void printStringLetters(String str){
        for(int i =0; i< str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        String str = "Ayush Lingayat";
        Stringfun.printStringLetters(str);

    }
}