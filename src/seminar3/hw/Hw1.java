package seminar3.hw;
//Реализовать алгоритм сортировки слиянием

import java.util.Arrays;


public class Hw1 {
    public static void mergeSort(int[] arr, int arrLength) {
        if (arrLength < 2) {
            return;
        }
        int mid = arrLength / 2;
        int[] l = new int[mid];
        int[] r = new int[arrLength - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < arrLength; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, arrLength - mid);
        merge(arr, l, r, mid, arrLength - mid);
//        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }

        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
        System.out.println(Arrays.toString(arr));
    }

}