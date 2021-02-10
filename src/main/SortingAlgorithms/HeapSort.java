package SortingAlgorithms;

import DataStructures.Heap;


public class HeapSort implements ISortAlg {
    private static void heapSort(int[] arr) {
        Heap heap = new Heap(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = heap.get(0);
            heap.swap(0, i);
            heap.heapSize--;
            heap.heapify(0);
        }
    }

    @Override
    public void sort(int[] arr) {
        heapSort(arr);
    }
}
