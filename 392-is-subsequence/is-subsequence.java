class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (t.isEmpty()){
            return false;
        }
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = start; j < t.length(); j++) {
                start++;
                if (s.charAt(i) == t.charAt(j)) {
                    if (i == s.length() - 1) {
                        return true;
                    } else {
                        break;
                    }
                }
            }
        }
        return false;
    }
}