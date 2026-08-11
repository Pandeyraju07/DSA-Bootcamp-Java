package arrays;

import java.util.Arrays;

/**
 * Concept: passing arrays to methods.
 *
 * Arrays are objects → method gets a copy of the REFERENCE.
 * So the method can change the SAME heap array (see PassByValue in methods).
 *
 * PROBLEM:
 *   1) Swap two indexes in an array using a method
 *   2) Multiply every element by 2 using a method
 *
 * Dry run swap(arr, 0, 3) on [1, 2, 3, 4]:
 *   temp = 1
 *   arr[0] = 4
 *   arr[3] = 1
 *   → [4, 2, 3, 1]
 */
public class ArrayInMethods {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println("Before swap: " + Arrays.toString(arr));
        swap(arr, 0, 3);
        System.out.println("After swap:  " + Arrays.toString(arr));

        doubleEveryElement(arr);
        System.out.println("After *2:    " + Arrays.toString(arr));
    }

    /** Swap values at index i and j */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /** Change every element in-place */
    private static void doubleEveryElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }
}
