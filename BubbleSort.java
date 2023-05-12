import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        System.out.println("before sort : "+Arrays.toString(array));
        bubbleSort(array);
        System.out.println("after sort : "+Arrays.toString(array));

    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
