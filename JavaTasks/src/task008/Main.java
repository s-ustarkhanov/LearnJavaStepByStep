package task008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();


        if (firstNumber % 2 == 0 && firstNumber % 3 == 0) {
            long check = (long) Math.pow(firstNumber, secondNumber);
            if (check < Integer.MIN_VALUE || check > Integer.MAX_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {
                System.out.println(check);
            }
        } else if (firstNumber % 2 == 0 || secondNumber % 3 == 0) {
            if (firstNumber > secondNumber) {
                System.out.println("Первое число больше второго");
            } else if (firstNumber < secondNumber){
                System.out.println("Второе число больше первого");
            } else {
                System.out.println("Числа равны");
            }
        }
    }
}