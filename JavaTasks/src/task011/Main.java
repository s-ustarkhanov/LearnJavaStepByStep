package task011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        System.out.print(" ");
        for (int i = 0; i < length ; i++) {
            System.out.print("-");
        }
        System.out.println(" ");

        for (int i = 0; i < width; i++) {
            System.out.print("|");
            for (int j = 0; j < length; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        if (width > 1) {
            System.out.print(" ");
            for (int i = 0; i < length; i++) {
                System.out.print("-");
            }
            System.out.println(" ");
        }

    }
}