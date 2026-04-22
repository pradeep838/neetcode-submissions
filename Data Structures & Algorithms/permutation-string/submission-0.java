class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] hmap1 = new int[26]; // freq map of s1
        int[] hmap2 = new int[26]; // sliding window in s2

        for (int i = 0; i < s1.length(); i++) {
            hmap1[s1.charAt(i) - 'a']++;
            hmap2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(hmap1, hmap2)) return true;

        for (int i = s1.length(); i < s2.length(); i++) {
            // remove the leftmost char of the previous window
            hmap2[s2.charAt(i - s1.length()) - 'a']--;
            // add the new char in the current window
            hmap2[s2.charAt(i) - 'a']++;

            if (Arrays.equals(hmap1, hmap2)) return true;
        }

        return false;
    }
}
