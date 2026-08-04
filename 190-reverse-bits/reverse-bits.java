class Solution {
    public int reverseBits(int n) {
       int total = 0;
			
			for (int i = 0; i < 32; i++) {
				total = total << 1;
				int lastBit = n & 1;
				total = total | lastBit;
				n = n >>> 1;
			}
			return total; 
    }
}