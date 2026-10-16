class Solution {
    public boolean isPerfectSquare(int num) {

        long left = 1;
        long right = num;

        while (left <= right) {
            long  mid = left + (right - left) / 2;
            long  sqr = mid * mid;

            if (sqr == num) {
                return true;
            } else if (sqr > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}