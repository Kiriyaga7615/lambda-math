package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // нонімний клас
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Addition Result: " + addition.operate(5, 3)); // 8

        StringManipulator toUpperCase = (s) -> s.toUpperCase();
        System.out.println("Uppercase String: " + toUpperCase.manipulate("Four!"));

        Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;
        String testString = "Four!";
        System.out.println("Uppercase Count: " + uppercaseCounter.apply(testString)); // 2

        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Random Number: " + randomSupplier.get());
    }
}
