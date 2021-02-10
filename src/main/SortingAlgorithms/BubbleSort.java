package SortingAlgorithms;

import static Utilities.ArrayUtilities.swap;

public class BubbleSort implements ISortAlg {
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i; j < arr.length; j++)
                if (arr[i] > arr[j])
                    swap(arr, i, j);
    }

    @Override
    public void sort(int[] arr) {
        bubbleSort(arr);
    }
}
