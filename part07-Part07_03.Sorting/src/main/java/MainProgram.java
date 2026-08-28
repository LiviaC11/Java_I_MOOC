import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array) {
        int index = indexOfSmallest(array);
        return array[index];
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int y = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < y) {
                index = i;
                y = array[i];
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int y = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < y) {
                index = i;
                y = table[i];
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int daCambiare = array[index1];
        array[index1] = array[index2];
        array[index2] = daCambiare;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexSmallest);

        }

    }
}
