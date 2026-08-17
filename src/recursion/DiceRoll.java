package recursion;

import java.util.ArrayList;

/**
 * Concept: Dice roll target sum (recursion).
 *
 * INTERVIEW / AMAZON-STYLE:
 *   Find all ways to get target sum with faces 1..6.
 *
 * Example:
 *   target = 4
 *   → 1111, 112, 121, 13, 211, 22, 31, 4 ...
 *
 * Idea:
 *   For face = 1..6 (while face <= remaining target)
 *     append face and recurse with target - face
 *
 * Dry run target=3:
 *   take 1 → remaining 2
 *   take 2 → remaining 1
 *   take 3 → remaining 0 → print path
 *
 * Time: exponential in target   Space: O(target)
 */
public class DiceRoll {

    public static void main(String[] args) {
        System.out.println(diceList("", 4));
    }

    private static ArrayList<String> diceList(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int face = 1; face <= 6 && face <= target; face++) {
            ans.addAll(diceList(p + face, target - face));
        }
        return ans;
    }
}
