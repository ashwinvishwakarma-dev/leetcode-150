class Solution {
  public int calculate(String s) {
    Stack<Integer> stack = new Stack<>();

    int number = 0;
    int result = 0;
    int sign = 1;

    for (int i = 0; i < s.length(); i++) {

      char ch = s.charAt(i);

      if (Character.isDigit(ch)) {
        number = number * 10 + (ch - '0');
      } else if (ch == '+') {
        result = result + (number * sign);
        number = 0;
        sign = 1;
      } else if (ch == '-') {
        result = result + (number * sign);
        number = 0;
        sign = -1;
      } else if (ch == '(') {
        stack.push(result);
        stack.push(sign);

        result = 0;
        sign = 1;
      } else if (ch == ')') {
        result = result + (number * sign);

        int previousSign = stack.pop();
        int previousNumber = stack.pop();

        result = previousNumber + (previousSign * result);
        number = 0;
      }

    }
    result = result + number * sign;
    return result;
  }
}