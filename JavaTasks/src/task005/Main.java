package task005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Числа равны");
        } else if (firstNumber % 2 == 0) {
            System.out.println(firstNumber * secondNumber);
        } else {
            System.out.println(firstNumber / secondNumber);
        }
    }
}
