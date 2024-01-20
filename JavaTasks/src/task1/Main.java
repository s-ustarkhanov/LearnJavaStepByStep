package task1;

public class Main {
    public static void main(String[] args) {
        int a = 12541;
        int b = 12312;

//        int temp = a;
//        a = b;
//        b = temp;

        // without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Значение а: " + a + ". Значение b: " + b);

        for (int i = 0; i < 5; i++) {
                
        }
    }
}
