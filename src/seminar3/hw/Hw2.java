package seminar3.hw;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.Arrays;


public class Hw2 {
    public static void countingUnevenNums(int[] args) {
        int countUnevenNums = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] % 2 != 0) {
                countUnevenNums++;
            }
        }
        sortArray(args, countUnevenNums);
    }

    public static void sortArray(int[] args, int countUnevenNums) {
        System.out.println("Задан список целых чисел:" + Arrays.toString(args));
        int[] newArray = new int[countUnevenNums];
        int j = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] % 2 != 0) {
                newArray[j] = args[i];
                j++;
            }
        }
        System.out.println("Список целых нечетных чисел:" + Arrays.toString(newArray));
    }
}
