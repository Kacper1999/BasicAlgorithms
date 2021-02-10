package DataStructuresTest;
import DataStructures.Heap;
import org.junit.jupiter.api.Test;

import static Utilities.ArrayUtilities.getRandomIntArr;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HeapTest {
    private final static int[] sizes = {0, 1, 2, 5, 10, 11, 20, 100};

    @Test
    void MaxHeapTest() {
        for (int size : sizes) {
            Heap mh = new Heap(getRandomIntArr(size));
            assertTrue(mh.valid());
        }
    }
}
