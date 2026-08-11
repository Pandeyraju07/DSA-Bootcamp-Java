package methods;

import java.util.Arrays;

/**
 * Java is pass-by-value (interview favorite for methods).
 *
 * For primitives (int, double, ...):
 *   method gets a COPY of the value → original NOT changed.
 *
 * For objects/arrays:
 *   method gets a COPY of the reference (same object in heap)
 *   → can change object contents
 *   → cannot make caller's variable point to a different object
 *
 * Classic interview trap: write a swap(a, b) for ints — it will FAIL
 * to swap the originals, because only copies are swapped.
 */
public class PassByValue {

    public static void main(String[] args) {
        primitiveSwapFails();
        arrayContentsCanChange();
        reassignReferenceDoesNotChangeCaller();
    }

    /**
     * INTERVIEW CLASSIC: swap two ints — does NOT swap originals.
     *
     * Dry run:
     *   main: a=10, b=20
     *   swap gets copies x=10, y=20
     *   inside swap: x=20, y=10
     *   back in main: a still 10, b still 20
     */
    private static void primitiveSwapFails() {
        System.out.println("=== 1. PRIMITIVE SWAP (fails) ===");

        int a = 10;
        int b = 20;
        System.out.println("Before: a=" + a + ", b=" + b);

        swap(a, b);

        System.out.println("After:  a=" + a + ", b=" + b);
        System.out.println("Reason: only copies were swapped inside swap()");
    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        // x and y are local copies — gone when method ends
    }

    /**
     * Array/object: copy of reference → same heap array → contents change.
     *
     * Dry run:
     *   arr in main points to [1, 2, 3]
     *   changeFirst gets same array address
     *   sets index 0 to 99
     *   main sees [99, 2, 3]
     */
    private static void arrayContentsCanChange() {
        System.out.println("\n=== 2. ARRAY CONTENTS CAN CHANGE ===");

        int[] arr = {1, 2, 3};
        System.out.println("Before: " + Arrays.toString(arr));

        changeFirst(arr);

        System.out.println("After:  " + Arrays.toString(arr));
    }

    private static void changeFirst(int[] nums) {
        nums[0] = 99; // same array object
    }

    /**
     * Rebinding the parameter to a NEW array does NOT change caller's variable.
     *
     * Dry run:
     *   main arr → [1, 2, 3]
     *   reassign(nums): nums = new int[]{9,9,9}  (local only)
     *   main arr still → [1, 2, 3]
     */
    private static void reassignReferenceDoesNotChangeCaller() {
        System.out.println("\n=== 3. REASSIGN REFERENCE (caller unchanged) ===");

        int[] arr = {1, 2, 3};
        System.out.println("Before: " + Arrays.toString(arr));

        reassign(arr);

        System.out.println("After:  " + Arrays.toString(arr));
    }

    private static void reassign(int[] nums) {
        nums = new int[]{9, 9, 9}; // only local copy of reference changes
    }
}
