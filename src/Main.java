import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numberOfBooks;

        final int NUM = 15;

        String word = "Apple";
        numberOfBooks = NUM + word;

        System.out.println(numberOfBooks);

        System.out.println("Количество книг - " + NUM);
        System.out.println("I have " + NUM + " books");

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }


    }
}