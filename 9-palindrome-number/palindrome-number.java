class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int temp = x;

        if (temp<0){
            System.out.println(temp + " can't be palindrome");
            return false; 
        }

        if (temp > 0 && temp < 10) {
            System.out.println(temp + " is palindrome");
            return true;
        }

        if (temp == 10) {
            System.out.println(temp + " can't be palindrome");
            return false;
        }
        while (temp >= 10) {
            int left = temp / 10;
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp = left;

            if (temp < 10) {
                sum = sum * 10 + temp;
            }
        }
        if (sum == x) {
            return true;
        } else {
            return false;
        }
    }
}