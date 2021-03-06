package leetcode;

/**
 * https://leetcode.com/problems/detect-capital
 */
public final class Problem520DetectCapital {
    // Time - O(N), Space - O(1)
    public boolean detectCapitalUse(String word) {
        return word != null
            && (word.length() < 2
            || isAllCaps(word)
            || isNotCaps(word)
            || hasOnlyFirstCap(word));
    }

    // Time - O(N), Space - O(1)
    private static boolean isAllCaps(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Time - O(N), Space - O(1)
    private static boolean isNotCaps(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Time - O(N), Space - O(1)
    private static boolean hasOnlyFirstCap(String word) {
        boolean firstCap = Character.isUpperCase(word.charAt(0));
        if (!firstCap) {
            return false;
        }

        for (int i = 1; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
