class Solution {
  public boolean wordPattern(String pattern, String s) {
    String[] str = s.split("\\s");

    if (pattern.length() != str.length) {
      return false;
    }

    HashMap<Character, String> charToWord = new HashMap<>();
    HashMap<String, Character> wordToChar = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {

      char character = pattern.charAt(i);
      String word = str[i];

      if (charToWord.containsKey(character)) {
        if (!charToWord.get(character).equals(word)) {
          return false;
        }
      }
      charToWord.put(character, word);

      if (wordToChar.containsKey(str[i])) {
        if (!wordToChar.get(word).equals(character)) {
          return false;
        }
      }

      wordToChar.put(word, character);
    }
    return true;
  }
}