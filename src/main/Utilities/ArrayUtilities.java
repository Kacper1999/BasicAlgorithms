package Utilities;

import java.util.Random;

public class ArrayUtilities {
    private static final Random rand = new Random();

    public static int[] getRandomIntArr(int size) {
        return getRandomIntArr(size, -50, 50);
    }

    public static int[] getRandomIntArr(int size, int lb, int ub) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++)
            output[i] = rand.nextInt(ub - lb) + lb;
        return output;
    }

    public static String getRandomString(int size) {
        char [] output = new char[size];
        int lb = 'a';
        int ub = 'z' + 1;
        for (int i = 0; i < size; i++)
            output[i] = (char)(rand.nextInt(ub - lb) + lb);
        return new String(output);
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
