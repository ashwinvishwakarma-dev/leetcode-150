class Solution {
  public boolean wordPattern(String pattern, String s) {
    String[] str = s.split("\\s");

    if (pattern.length() != str.length) {
      return false;
    }

    HashMap<Character, String> charToWord = new HashMap<>();
    HashMap<String, Character> wordToChar = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {
      if (charToWord.containsKey(pattern.charAt(i))) {
        if (!charToWord.get(pattern.charAt(i)).equals(str[i])) {
          return false;
        }
      }
      charToWord.put(pattern.charAt(i), str[i]);
    }
    for (int i = 0; i < pattern.length(); i++) {
      if (wordToChar.containsKey(str[i])) {
        if (!wordToChar.get(str[i]).equals(pattern.charAt(i))) {
          return false;
        }
      }
      wordToChar.put(str[i], pattern.charAt(i));
    }

    return true;
  }
}