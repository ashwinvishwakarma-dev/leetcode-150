class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();

        boolean[][] dp = new boolean[n][n];

        int start = 0;
        int maxLength = 1;

        // Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // length = length of substring
        for (int length = 2; length <= n; length++) {

            for (int i = 0; i + length <= n; i++) {

                int j = i + length - 1;

                if (s.charAt(i) == s.charAt(j)) {

                    // Length 2
                    // or inside substring is palindrome
                    if (length <= 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;

                        if (length > maxLength) {
                            maxLength = length;
                            start = i;
                        }
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}