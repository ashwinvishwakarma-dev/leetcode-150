class Solution {
    public boolean isAnagram(String s, String t) {

          if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[150];

        for (char c : s.toCharArray()) {
            arr[c] = arr[c] + 1;
        }

        for (char c : t.toCharArray()) {
            arr[c] = arr[c] - 1;
        }

        for (int count : arr) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}