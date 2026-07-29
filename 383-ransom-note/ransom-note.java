class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count > 0) {
                map.put(c, count - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}