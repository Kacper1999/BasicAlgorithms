import DataStructures.Heap;
import SortingAlgorithms.BubbleSort;
import SortingAlgorithms.HeapSort;
import SortingAlgorithms.MergeSort;
import SortingAlgorithms.QuickSort;
import Utilities.ArrayUtilities;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrLen = 10;
        int[] arr = ArrayUtilities.getRandomIntArr(arrLen);
        int[] clone = arr.clone();

        System.out.println(Arrays.toString(arr));
        new HeapSort().sort(arr);
        System.out.println(Arrays.toString(arr));
        arr = clone.clone();

//        System.out.println(Arrays.toString(arr));
//        new MergeSort().sort(arr);
//        System.out.println(Arrays.toString(arr));
//        arr = clone.clone();
//
//        System.out.println(Arrays.toString(arr));
//        new BubbleSort().sort(arr);
//        System.out.println(Arrays.toString(arr));
//        arr = clone.clone();
//
//        System.out.println(Arrays.toString(arr));
//        new QuickSort().sort(arr);
//        System.out.println(Arrays.toString(arr));
//        arr = clone.clone();
    }
}
