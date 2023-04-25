package seminar3;

import seminar2.task.Task1;
import seminar3.hw.*;
import seminar3.task.Task2;
import seminar3.task.Task3;
import seminar3.task.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Task1.main();
//        ArrayList<String> poetry = new ArrayList<>();
//        poetry.add("Поэзия");
//        poetry.add("Увгений Онегин");
//        poetry.add("Облако в штанах");
//        ArrayList<String> prose = new ArrayList<>();
//        prose.add("Проза");
//        prose.add("Накануне");
//        prose.add("Преступление инаказание");
//        Task2.fillLibrary(poetry);
//        Task2.fillLibrary(prose);
//        Task3.delIntFromList();

        System.out.println("Task1:");
        int[] arr = new int[]{10, 6, -18, 55, 7, -3, 4, -7, 1};
        System.out.println("Задан массив данных:" + Arrays.toString(arr));
        System.out.println("Сортировка слиянием:");
        int n = arr.length;
        Hw1.mergeSort(arr, n);
        System.out.println();

        System.out.println("Task2:");
        Hw2.countingUnevenNums(new int[]{10,6,18,55,7,-3,4,99,-5,33,82});
        System.out.println();

        System.out.println("Task3:");
        int [] array = new int[]{2,4,3,6,7,33,44,55,99,1,3};
        System.out.println("Задан целочисленный список:"+ Arrays.toString(array));
        Hw3.minNumbArr(array);
        Hw3.maxNumbArr(array);
        Hw3.averNumsArr(array);
        System.out.println();
        System.out.println();

        System.out.println("Task4:");

        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Integer[] arr2 = new Integer[]{7, 8, 9, 10, 11, 12, 13, 14};
        Hw4.differenceArrays(arr1, arr2);

    }
}
