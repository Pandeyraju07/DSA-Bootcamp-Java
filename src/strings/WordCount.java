package strings;

/**
 * Concept: split / scan spaces in a sentence.
 *
 * PROBLEM:
 *   Count words in a sentence.
 *   Also print the longest word.
 *
 * Example:
 *   "I love Java coding" → words=4, longest="coding"
 *
 * Approach:
 *   trim, then split by one or more spaces: split("\\s+")
 *
 * Dry run:
 *   parts = ["I", "love", "Java", "coding"]
 *   longest by length → coding
 */
public class WordCount {

    public static void main(String[] args) {
        String sentence = "I love Java coding";

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Word count = " + words.length);
        System.out.println("Longest    = " + longestWord(words));
    }

    private static String longestWord(String[] words) {
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
