class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<4){
            if(n==1) return true;
            return false;
        }
        if(n%4!=0) return false;
        else return isPowerOfFour(n/4);
    }
}