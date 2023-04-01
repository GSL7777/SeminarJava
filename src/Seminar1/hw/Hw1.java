package Seminar1.hw;

import java.time.LocalDateTime;
import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Hw1 {
    public static void run() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = iScanner.nextInt();
        int num_sum = 0;
        int num_mult = 1;
        for (int i = 1; i <= n; i++) {
            num_sum = num_sum + i * (i + 1) / 2;
            num_mult = num_mult * i;
        }
        System.out.println(num_sum);
        System.out.println(num_mult);
    }
}
