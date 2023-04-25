package seminar3.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//*Реализовать разность массивов и симметрическую разность.
public class Hw4 {

    public static void differenceArrays(Integer[] arr1, Integer[] arr2) {
        System.out.println("Задан массив данных arr1:" + Arrays.toString(arr1));
        System.out.println("Задан массив данных arr2:" + Arrays.toString(arr2));
        System.out.println();
        List<Integer> list1 = getListArr(arr1);
        List<Integer> list2 = getListArr(arr2);
        List<Integer> list1Double = getListArr(arr1);
        List<Integer> list2Double = getListArr(arr2);


        list1.removeAll(list2);
        Integer[] diffArraysArr1Arr2 = list1.toArray(new Integer[list1.size()]);
        System.out.println("Разность данных массивов arr1 и arr2:" + Arrays.toString(diffArraysArr1Arr2));

        list2Double.removeAll(list1Double);
        Integer[] diffArraysArr2Arr1 = list2Double.toArray(new Integer[list2Double.size()]);
        System.out.println("Разность данных массивов arr2 и arr1:" + Arrays.toString(diffArraysArr2Arr1));

        list1.addAll(list2Double);
        Integer[] symmetricDiffArrays = list1.toArray(new Integer[list1.size()]);
        System.out.println("Симметрическая разность данных массивов arr1 и arr2:" + Arrays.toString(symmetricDiffArrays));

    }

    public static List getListArr(Integer[] arr) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        return list;
    }
}

