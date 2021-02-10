package SortingAlgorithms;
import static Utilities.ArrayUtilities.swap;

public class QuickSort implements ISortAlg {

    private static void quickSort(int[] arr, int l, int r) {
        if (r <= l + 1) return;

        int pivot = arr[l];
        int mid = l;
        for (int i = l; i < r; i++) {
            if (arr[i] < pivot) {
                swap(arr, mid++, i);
                swap(arr, mid, i);
            }
        }
        quickSort(arr, l, mid);
        quickSort(arr,mid + 1, r);
    }

    @Override
    public void sort(int[] arr) {
        quickSort(arr,0, arr.length);
    }
}
