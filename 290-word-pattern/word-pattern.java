class Solution {
    public boolean wordPattern(String pattern, String s) {
          HashMap<Character, String> map = new HashMap<>();
        String[] str = s.split("\\s");

        HashSet<Character> characterSet = new HashSet<>();
        HashSet<String> stringSet = new HashSet<>();

        if (pattern.length() != str.length) {
            return false;
        }

        for (char c : pattern.toCharArray()) {
            characterSet.add(c);
        }
        for (String string : str) {
            stringSet.add(string);
        }
        if (characterSet.size() != stringSet.size()) {
            return false;
        }
        for (int i = 0; i < str.length; i++) {

            if (map.containsKey(pattern.charAt(i))) {
                if (!str[i].equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            } else {
                map.put(pattern.charAt(i), str[i]);
            }

        }

        return true;
    }
}