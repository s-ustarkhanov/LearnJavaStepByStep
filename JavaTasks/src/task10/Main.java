package task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        System.out.println(result);
    }
}