class Solution {
    public int hIndex(int[] citations) {
         int count = 0;
        int len = citations.length;
        int[] newCitations = new int[len + 1];

        for (int i = 0; i < len; i++) {
            if (citations[i] < len) {
                int num = newCitations[citations[i]];
                newCitations[citations[i]] = num + 1;
            } else {
                newCitations[len] = newCitations[len] + 1;
            }
        }
        for (int i = newCitations.length - 1; i >= 0; i--) {
            count = count + newCitations[i];
            if (count >= i) {
                return i;
            }
        }
        return 0;
    
    }
}