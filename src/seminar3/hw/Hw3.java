package seminar3.hw;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
public class Hw3 {
    public static void minNumbArr(int[] args) {
        int minNumb = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < minNumb) {
                minNumb = args[i];
            }
        }
        System.out.println("Минимальное значение:" + minNumb);
    }

    public static void maxNumbArr(int[] args) {
        int maxNumb = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] > maxNumb) {
                maxNumb = args[i];
            }
        }
        System.out.println("Максимальное значение:" + maxNumb);
    }

    public static void averNumsArr(int[] args) {
        double sumNumbsArr = 0;
        for (int i = 0; i < args.length; i++) {
            sumNumbsArr = sumNumbsArr + args[i];
        }
        double averNumbs = sumNumbsArr / args.length;
        System.out.printf("Среднее арифметическое значение:" + "%.2f", averNumbs);
    }

}

