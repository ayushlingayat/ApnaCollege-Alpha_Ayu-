class OopsBasic{
    public static void main(String args[]){
        Pen p1 = new Pen(); //created a Pen object called p1

        //Now setting the color 
        p1.setColor("Orange");
        System.out.println(p1.color);
        p1.setTipSize(12);
        System.out.println(p1.tip);

        //Directly set the color
        p1.color = "Red";
        System.out.println(p1.color);
    }
}

//Creating a class here means blueprint of object 

class Pen{
    String color; //Properties 
    int tip; //attributes

    //now we create a function here 

     void setColor(String newColor){
        color = newColor;
    }

    void setTipSize(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void setName(String newName){
        name = newName;
    }

    void setAge(int newAge){
        age = newAge;
    }
    void setPercentage(int newPercentage){
        percentage = newPercentage;
    }
}