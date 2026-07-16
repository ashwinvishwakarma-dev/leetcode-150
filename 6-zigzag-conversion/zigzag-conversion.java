class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder[] rows = new StringBuilder[numRows];
        boolean goingDown = false;
        int currentRow = 0;

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow = currentRow + (goingDown ? 1 : -1);
        }

        for (StringBuilder row : rows) {
            sb.append(row);
        }
        return sb.toString();
    }
}