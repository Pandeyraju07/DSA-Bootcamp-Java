package recursion;

/**
 * Concept: Check if array is sorted using recursion.
 *
 * Idea:
 *   arr[i] <= arr[i+1] AND rest of array is sorted
 *
 * Dry run [1, 2, 3, 4]:
 *   1<=2 and sorted([2,3,4]) → true
 *
 * Dry run [1, 3, 2]:
 *   1<=3 and sorted([3,2]) → 3<=2? false
 *
 * Time: O(n)   Space: O(n)
 */
public class SortedCheck {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 3, 2, 4};

        System.out.println("Sorted a? " + isSorted(a, 0));
        System.out.println("Sorted b? " + isSorted(b, 0));
    }

    private static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] <= arr[index + 1] && isSorted(arr, index + 1);
    }
}
