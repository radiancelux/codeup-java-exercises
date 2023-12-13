import java.util.Scanner;

public class ConsoleExercise {
    public static void main(String[] args) {
        // 1. Display the value of pi
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        // 2. Prompt user to enter an integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int userInteger = scanner.nextInt();
        System.out.println("You entered: " + userInteger);

        // 3. Prompt user to enter 3 words
        System.out.print("Please enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("You entered:\n" + word1 + "\n" + word2 + "\n" + word3);

        // 4. Prompt user to enter a sentence using next method
        scanner.nextLine(); // Consume the newline character left by nextInt
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        // 5. Rewrite the above example using nextLine method.
        System.out.print("Please enter another sentence: ");
        String anotherSentence = scanner.nextLine();
        System.out.println("You entered: " + anotherSentence);

        // Calculate the area and perimeter of a rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the width of the rectangle: ");
        double width = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        // Bonuses:
        // Accept decimal entries and calculate volume
        System.out.print("Enter the height of the rectangle: ");
        double height = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        System.out.println("Volume: " + volume);

        // Set delimiter to newline
        scanner.useDelimiter("\n");

        // Rewrite the classroom program to use nextInt method
        System.out.print("Enter the length of the classroom: ");
        int roomLength = scanner.nextInt();

        System.out.print("Enter the width of the classroom: ");
        int roomWidth = scanner.nextInt();

        int roomArea = roomLength * roomWidth;
        int roomPerimeter = 2 * (roomLength + roomWidth);

        System.out.println("Room Area: " + roomArea);
        System.out.println("Room Perimeter: " + roomPerimeter);
    }
}
