package DataStructures;

public class Heap {
    private int[] heap;
    private int len;
    public int heapSize;

    public Heap(int[] arr) {
        this.heap = arr.clone();
        this.len = arr.length;
        buildHeap();
    }

    public static int left(int i) {
        return 2 * i + 1;
    }

    public static int right(int i) {
        return 2 * i + 2;
    }

    public static int parent(int i) {
        return (i - 1) / 2;
    }

    public int[] getHeap() {
        return heap;
    }

    public int get(int i) {
        return heap[i];
    }

    public void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    private void buildHeap() {
        heapSize = len;
        for (int i = len / 2 - 1; i >= 0; i--)
            heapify(i);
    }


    public boolean valid() {
        for (int i = len / 2 - 1; i >= 0; i--) {
            int l = left(i);
            int r = right(i);
            if ((l < len && heap[l] > heap[i]) || (r < len && heap[r] > heap[i]))
                return false;
        }
        return true;
    }

    public void heapify(int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heapSize && heap[l] > heap[largest])
            largest = l;
        if (r < heapSize && heap[r] > heap[largest])
            largest = r;
        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    private String getStringRepr(int i, int indent) {
        if (i >= len)
            return "";
        String output = "|-".repeat(indent) + heap[i] + "\n";
        output += getStringRepr(left(i), indent + 1);
        output += getStringRepr(right(i), indent + 1);
        return output;
    }

    @Override
    public String toString() {
        return getStringRepr(0, 0);
    }
}
