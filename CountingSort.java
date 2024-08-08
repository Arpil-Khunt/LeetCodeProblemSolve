import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7, 8, 10, 9 };
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        int[] frequency = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            frequency[j]++;
        }
        int count = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                for (int j = frequency[i]; j > 0; j--) {
                    arr[count] = i;
                    count++;

                }
            }
        }
    }
}
