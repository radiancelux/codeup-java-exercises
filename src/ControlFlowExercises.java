import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        // Question 1: While Loop
//
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//
//        // Question 2: Do-While Loop (Count by 2's)
//
//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);
//
//
//        // Question 2: Do-While Loop (Count backwards by 5's)
//
//        int k = 100;
//        do {
//            System.out.println(k);
//            k -= 5;
//        } while (k >= -10);
//
//
//        // Question 2: Do-While Loop (Squared)
//
//        long longNum = 2;
//        do {
//            System.out.println(longNum);
//            longNum *= longNum;
//        } while (longNum < 1000000);
//
//
//        // Question 3: For Loop (Count by 2's)
//
//        for (int e = 0; e <= 100; e += 2) {
//            System.out.println(e);
//        }
//
//
//        // Question 3: For Loop (Count backwards by 5's)
//
//        for (int b = 100; b >= -10; b -= 5) {
//            System.out.println(b);
//        }
//
//
//        // Question 3: For Loop (Squared)
//
//        for (long l = 2; l < 1000000; l *= l) {
//            System.out.println(l);
//        }
//
//
//        // Question 4: FizzBuzz
//
//        for (int f = 1; f <= 100; f++) {
//            if (f % 3 == 0 && f % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (f % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (f % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(f);
//            }
//        }
//
//
//        // Question 5: Display a table of powers
//
//        String power;
//        do {
//            System.out.print("Enter an integer: ");
//            int powerNum = scanner.nextInt();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int p = 1; p <= powerNum; p++) {
//                int squared = p * p;
//                int cubed = p * p * p;
//                System.out.printf("%-6d | %-7d | %-5d%n", p, squared, cubed);
//            }
//            System.out.print("Do you want to continue? (yes/no): ");
//            power = scanner.next();
//        } while (power.equalsIgnoreCase("yes"));
//
//

        // Question 6: Convert numerical grades to letter grades (Includes Bonus)

        String gradeOut;

        do {
            System.out.print("Enter a numerical grade (0-100): ");
            int grade = scanner.nextInt();
            char gradeSymbol;
            if (grade >= 97) {
                gradeSymbol = '+';
            } else if (grade >= 94) {
                gradeSymbol = ' ';
            } else if (grade >= 90) {
                gradeSymbol = '-';
            } else {
                gradeSymbol = ' ';
            }
            if (grade >= 88) {
                System.out.println("A" + gradeSymbol);
            } else if (grade >= 80) {
                System.out.println("B" + gradeSymbol);
            } else if (grade >= 67) {
                System.out.println("C" + gradeSymbol);
            } else if (grade >= 60) {
                System.out.println("D" + gradeSymbol);
            } else {
                System.out.println("F");
            }
            System.out.print("Do you want to continue? (yes/no): ");
            gradeOut = scanner.next();
        } while (gradeOut.equalsIgnoreCase("yes"));

    }
}
