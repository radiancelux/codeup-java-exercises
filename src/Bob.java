import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, I'm Bob. Let's chat!");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else {
                System.out.println("Bob: Whatever.");
            }

            System.out.print("Do you want to continue chatting with Bob? (yes/no): ");
            String continueChat = scanner.nextLine().toLowerCase();

            if (!continueChat.equals("yes")) {
                System.out.println("Bob: Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
