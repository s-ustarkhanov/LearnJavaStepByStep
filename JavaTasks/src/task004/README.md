
# Задача 4 (RU)

```java
public class Main {

    public static void main(String[] args) {

        int a = 1;

        int b = a++;

        b += a++;

        System.out.println(b);

    }

}
```

**Описание:**  
Программа вычисляет значение переменной `b` через несколько операций с использованием инкрементов. Значение `b`, выведенное на экран, совпадает с тем, что вы ожидали увидеть? Если нет, порекомендуем снова ознакомиться с принципами работы префиксных и постфиксных инкрементов в Java.

---

# Task 4 (EN)

```java
public class Main {

    public static void main(String[] args) {

        int a = 1;

        int b = a++;

        b += a++;

        System.out.println(b);

    }

}
```

**Description:**  
The program calculates the value of the variable `b` through several operations using increments. Does the value of `b` printed on the screen match what you expected to see? If not, it is recommended to revisit the principles of prefix and postfix increments in Java.