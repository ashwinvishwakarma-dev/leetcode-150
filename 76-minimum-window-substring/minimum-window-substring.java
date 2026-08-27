class Solution {
  public String minWindow(String s, String t) {
    if (t.length() > s.length()) {
      return "";
    }

    int[] need = new int[128];
    int[] have = new int[128];

    int left = 0;
    int start = -1;
    int minLength = Integer.MAX_VALUE;

    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      need[c] = need[c] + 1;
    }

    for (int right = 0; right < s.length(); right++) {
      char c = s.charAt(right);
      have[c] = have[c] + 1;

      while (isValid(have, need)) {
        int len = right - left + 1;

        if (len < minLength) {
					minLength = len;
					start = left;
				}
        char leftChar = s.charAt(left);
        have[leftChar] = have[leftChar] - 1;
        left++;
      }
    }

    if (start == -1) {
      return "";
    }

    return s.substring(start, start + minLength);
  }

  private boolean isValid(int[] have, int[] need) {
    for (int i = 0; i < 128; i++) {
      if (need[i] > have[i]) {
        return false;
      }
    }
    return true;

  }
}