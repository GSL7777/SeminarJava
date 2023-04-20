package seminar2.hw;
//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hw1 {
    private static final Logger LOG = Log.log(seminar2.hw.Hw1.class.getName());

    public static void writeInFile(int[] array) {
        String str = sortArray(array);
        try (FileWriter in = new FileWriter("Hw1.txt")) {
            in.append(str);
        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static String sortArray(int[] array) {
        System.out.println(Arrays.toString(array));
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
//                    System.out.println(Arrays.toString(array));
                    LOG.log(Level.INFO, Arrays.toString(array));
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return Arrays.toString(array);

    }
}
