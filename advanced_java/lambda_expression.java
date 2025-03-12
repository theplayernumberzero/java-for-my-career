package advanced_java;

// Functional interface
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

class LambdaExample {
    public static void main(String[] args) {
        // lambda can only be used with functional interface
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        // Testing the lambda expressions
        System.out.println("Addition: " + add.calculate(5, 3));        // Output: 8
        System.out.println("Multiplication: " + multiply.calculate(5, 3)); // Output: 15
    }
}