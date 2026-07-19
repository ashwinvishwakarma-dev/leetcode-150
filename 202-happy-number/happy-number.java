class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> seen = new HashSet<>();
        while (n != 1) {

            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum = sum + rem * rem;
                n=n/10;
            }
            n = sum;
        }
        return true;  
    }
}