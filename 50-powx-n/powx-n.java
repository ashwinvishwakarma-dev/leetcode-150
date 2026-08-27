class Solution {
  public double myPow(double x, int n) {
    long power = n;
    double result = 1;
    if (n < 0) {
      x = 1 / x;
      power = -power;
    }

    while (power > 0) {
      if (power % 2 == 1) {
        result = result * x;
      }
      power = power / 2;
      x = x * x;
    }

    return result;
  }
}