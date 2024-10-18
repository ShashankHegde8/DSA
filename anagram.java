
//anagram to check 2 strings containing same characters or not
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Create frequency maps for both strings
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Count frequency of characters in both strings
        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Compare the frequency maps
        return map1.equals(map2);
    }
}
