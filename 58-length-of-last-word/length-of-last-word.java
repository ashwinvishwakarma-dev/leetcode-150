class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        int count = 0;

        while (end >= 0) {
            char c = s.charAt(end);

            if (isBlankChar(c)) {
                if (count != 0) {
                    return count;
                }
                end--;
            } else {
                end--;
                count++;
            }
        }

        return count;
    }
    public boolean isBlankChar(char c) {
        return c == 32;
    }
}