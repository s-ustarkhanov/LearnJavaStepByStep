package task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str.equals("Hi")) {
            System.out.println("Hello");
        } else if (str.equals("Bye")) {
            System.out.println("Good bye");
        } else if (str.equals("How are you")) {
            System.out.println("How are your doing");
        } else {
            System.out.println("Unknown message");
        }

        testWithSwitch(scanner.nextLine());
    }

    public static void testWithSwitch(String str) {
        switch (str) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("How are your doing");
                break;
            default:
                System.out.println("Unknown message");
        }
    }
}
