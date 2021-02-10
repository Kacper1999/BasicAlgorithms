package SortingAlgorithms;

public class MergeSort implements ISortAlg {
    private static void merge(int[] arr, int l, int mid, int r) {
        int[] chunk = new int[r - l];

        int rIndex = mid;
        int lIndex = l;
        for (int i = 0; i < r - l; i++) {
            if (rIndex == r)  // we finished right half
                chunk[i] = arr[lIndex++];
            else if (lIndex == mid)  // we finished left half
                chunk[i] = arr[rIndex++];
            else if (arr[lIndex] > arr[rIndex])
                chunk[i] = arr[rIndex++];
            else
                chunk[i] = arr[lIndex++];
        }
        if (r - l >= 0)
            System.arraycopy(chunk, 0, arr, l, r - l);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (r - l <= 1) return;
        int mid;
        mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid, r);
        merge(arr, l, mid, r);
    }

    @Override
    public void sort(int[] arr) {
        mergeSort(arr,0, arr.length);
    }
}