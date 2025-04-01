public class AccessModifiers {
    public static void main(String args[]){
        BankAccount myAcc = new AccessModifiers().new BankAccount();
        // BankAccount myAcc = new BankAccount();
        myAcc.username = "lingayatayush3";

        myAcc.password = "123"; //yaha password nhi set krr sakhte because protected hee okk 
        System.out.println(myAcc.password);

        myAcc.setPassword("This is the password I am just accessing this will not set but");


    }

    class BankAccount{
        public String username;
        private String password;

        //function of password 

        public void setPassword(String pwd){
            password = pwd;
        }

    }
}
