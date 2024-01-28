package task003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = b * a * (a + b) / (a * a);

        System.out.println(c);
        testWithInt(scanner.nextInt(), scanner.nextInt());

    }

    public static void testWithInt(int a, int b) {
        int c = b * a * (a + b) / (a * a);
        System.out.println(c);
    }
}
