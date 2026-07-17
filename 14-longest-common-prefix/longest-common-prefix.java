class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs.length==1){
            return strs[0];
        }
        
        String str = strs[0];
        int len = 0;
        int start = 0;
        boolean allDone;
        boolean allWell = true;
        StringBuilder sb = new StringBuilder();

        while (len < str.length()) {
            if (!allWell) {
                break;
            }
            sb.append(str.charAt(start));
            allDone = false;

            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() > len) {
                    if (strs[i].startsWith(sb.toString())) {
                        if (i == strs.length - 1) {
                            allDone = true;
                            len++;
                            start++;
                        }
                    } else {
                        allWell = false;
                        break;
                    }
                } else {
                    allWell = false;
                    break;
                }
            }
        }

        return str.substring(0, len);
    }
}