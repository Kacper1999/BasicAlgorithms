package SortingAlgorithmsTest;

import SortingAlgorithms.*;
import Utilities.ArrayUtilities;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;


class SortingAlgorithmsTest {
    private final static int[] sizes = {0, 1, 2, 5, 10, 11, 20, 100};

    private static void sortTest(ISortAlg sortAlg) {
        for (int size : sizes) {
            int[] arr = ArrayUtilities.getRandomIntArr(size);
            int[] tmp = arr.clone();
            Arrays.sort(arr);
            sortAlg.sort(tmp);
            assertArrayEquals(tmp, arr);
        }
    }

    @Test
    void bubbleSortTest() {
        sortTest(new BubbleSort());
    }

    @Test
    void mergeSortTest() {
        sortTest(new MergeSort());
    }

    @Test
    void quickSortTest() {
        sortTest(new QuickSort());
    }

    @Test
    void heapSortTest() {
        sortTest(new HeapSort());
    }
}
