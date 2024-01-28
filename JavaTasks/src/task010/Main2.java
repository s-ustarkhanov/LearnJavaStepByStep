package task010;

import java.util.Scanner;

public class Main2 {
    // Решение с использованием String
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        String str = String.valueOf(number);

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += Character.getNumericValue(str.charAt(i));
        }

        System.out.println("Сумма цифр числа: " + result);

    }
}