class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        int vis[] = new int[128]; // Adjusted size for full ASCII range
        int sp = 0, lp = 0;
        int maxlen = 0;

        while (lp < s.length()) {
            int ch = s.charAt(lp);
            
            if (vis[ch] == 1) { // If character is already seen
                while (s.charAt(sp) != ch && sp < lp) {
                    vis[s.charAt(sp)] = 0; // Reset visited status
                    sp++;
                }
                sp++; // Move past the repeated character
            } else {
                vis[ch] = 1; // Mark character as seen
            }

            maxlen = Math.max(maxlen, lp - sp + 1); // Update max length
            lp++;
        }

        return maxlen;
    }
}