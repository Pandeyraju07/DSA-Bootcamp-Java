package recursion;

/**
 * Concept: Linear search using recursion.
 *
 * Idea:
 *   if arr[index] == target → return index
 *   else search(index + 1)
 *
 * Dry run arr=[3, 2, 1, 18, 9], target=18:
 *   i=0 no, i=1 no, i=2 no, i=3 yes → 3
 *
 * Find all indexes variant:
 *   keep a list, add when match, continue scanning
 *
 * Time: O(n)   Space: O(n) stack
 */
public class LinearSearchRecursion {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9, 18};
        int target = 18;

        System.out.println("First index = " + search(arr, target, 0));
        System.out.println("All indexes = " + findAll(arr, target, 0));
    }

    private static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, target, index + 1);
    }

    private static java.util.ArrayList<Integer> findAll(int[] arr, int target, int index) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        list.addAll(findAll(arr, target, index + 1));
        return list;
    }
}
