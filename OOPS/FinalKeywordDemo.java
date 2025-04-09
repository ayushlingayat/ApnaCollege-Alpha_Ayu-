
// Java program to demonstrate the use of the final keyword
public class FinalKeywordDemo {

    // final variable - value cannot be changed once assigned
    final int finalVariable = 100; //treated as constant

    // final method - cannot be overridden in subclasses
    public final void showMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalKeywordDemo obj = new FinalKeywordDemo();

        // Printing the value of the final variable
        System.out.println("Final variable value: " + obj.finalVariable);

        // Uncommenting the below line will cause a compilation error
        // because finalVariable cannot be reassigned.
        // obj.finalVariable = 200;

        // Calling the final method
        obj.showMessage();
    }
}

// final class - cannot be extended by any other class
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

// Uncommenting the below code will give an error
// because you cannot extend a final class

// class SubClass extends FinalClass {
//     // Error: Cannot inherit from final class
// }

// final variable: Once assigned, its value cannot be changed.

// final method: It cannot be overridden by a subclass.

// final class: It cannot be inherited or extended.