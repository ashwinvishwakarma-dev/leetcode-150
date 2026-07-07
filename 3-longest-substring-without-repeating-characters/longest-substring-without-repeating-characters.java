class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, (right - left) + 1);
            right++;

        }

        return max;
        
    }
}