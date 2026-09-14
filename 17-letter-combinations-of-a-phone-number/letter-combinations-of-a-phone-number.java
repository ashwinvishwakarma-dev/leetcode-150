class Solution {

    List<String> result = new ArrayList<>();

    String[] mapping = {
        "",     "",     "abc",  "def",
        "ghi",  "jkl",  "mno",  "pqrs",
        "tuv",  "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return result;
        }

        StringBuilder current = new StringBuilder();

        backtrack(digits, 0, current);

        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current) {

        // Base case
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get letters for current digit
        int digit = digits.charAt(index) - '0';
        String letters = mapping[digit];

        // Try every possible letter
        for (char c : letters.toCharArray()) {

            // Choose
            current.append(c);

            // Explore
            backtrack(digits, index + 1, current);

            // Undo
            current.deleteCharAt(current.length() - 1);
        }
    }
}