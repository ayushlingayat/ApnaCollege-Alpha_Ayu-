public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.add(5, 10));        // Calls add(int, int)
        System.out.println(obj.add(5, 10, 15));    // Calls add(int, int, int)
        System.out.println(obj.add(5.5, 10.5));    // Calls add(double, double)
    }
}


class MathOperations {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }
}

