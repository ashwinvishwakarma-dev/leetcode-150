class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                int count = map.get(c) - 1;
                map.put(c,count);
                if (count < 0) {
                    return false;
                }
            }
        }

        return true;
    }
}