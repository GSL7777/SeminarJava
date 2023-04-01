package Seminar1.hw;

//Вывести все простые числа от 1 до 1000
public class Hw2 {

    public static void main() {
        System.out.println ( "Простые числа от 1 до 1000:  ");
        for (int i = 2; i < 1000; i++) {
            int k = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0)
                    k++;
            }
            if (k < 2)
                System.out.println(i);
        }
    }
}