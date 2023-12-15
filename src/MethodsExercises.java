import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test addition, subtraction, multiplication, division, and modulus methods
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(10, 4));
        System.out.println("Multiplication: " + multiply(6, 7));
        System.out.println("Division: " + divide(15, 3));
        System.out.println("Modulus: " + modulus(20, 7));

        // Test multiplication without * operator
        System.out.println("Multiplication without * operator: " + multiplyWithoutOperator(4, 8));

        // Test getInteger method
        int userInput = getInteger(1, 10, scanner);
        System.out.println("User input within the range: " + userInput);

        // Test factorial calculation
        System.out.print("Enter an integer between 1 and 10: ");
        int input = scanner.nextInt();
        if (input >= 1 && input <= 10) {
            long factorial = calculateFactorial(input);
            System.out.println(input + "! = " + factorial);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
        }

        // Simulate dice rolling
        simulateDiceRolling(scanner);

        // High-Low guessing game
        playHighLowGame(scanner);

        scanner.close();
    }

    // Addition method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division method
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }

    // Modulus method
    public static int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Cannot calculate modulus with zero divisor.");
            return Integer.MIN_VALUE;
        }
    }

    // Multiplication without * operator using a loop
    public static int multiplyWithoutOperator(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    // Get an integer input within a specified range
    public static int getInteger(int min, int max, Scanner scanner) {
        int userInput;
        do {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;
    }

    // Calculate factorial of a number using recursion
    public static long calculateFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    // Simulate dice rolling
    public static void simulateDiceRolling(Scanner scanner) {
        System.out.print("Enter the number of sides for a pair of dice: ");
        int sides = scanner.nextInt();

        do {
            int roll1 = rollDice(sides);
            int roll2 = rollDice(sides);

            System.out.println("Roll 1: " + roll1);
            System.out.println("Roll 2: " + roll2);

            System.out.print("Roll again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));
    }

    // Generate a random number for dice rolling
    public static int rollDice(int sides) {
        return (int) (Math.random() * sides) + 1;
    }

    // High-Low guessing game
    public static void playHighLowGame(Scanner scanner) {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int numberOfGuesses = 0;
        int guess;

        System.out.println("Welcome to the High-Low guessing game!");

        do {
            guess = getInteger(1, 100, scanner);
            numberOfGuesses++;

            if (guess < numberToGuess) {
                System.out.println("HIGHER");
            } else if (guess > numberToGuess) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS! You guessed it in " + numberOfGuesses + " tries.");
            }
        } while (guess != numberToGuess);

        System.out.println("Thanks for playing!");
    }
}
