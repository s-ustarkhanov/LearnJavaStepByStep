package task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();
        String middleName = scanner.next();

        System.out.println("Ваше ФИО:" + " " + surname + " " + name + " " + middleName);

        System.out.printf("Ваше ФИО %s %s %s", surname, name , middleName);
    }
}
