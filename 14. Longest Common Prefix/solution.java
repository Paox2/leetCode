class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        
        int shortestLength = strs[0].length();
        int shortIndex = 0;
        for (int i = 1; i < strs.length; i++) {
            int curLength = strs[i].length();
            if (curLength < shortestLength) {
                shortestLength = curLength;
                shortIndex = i;
            }
        }
        
        if (shortestLength == 0)
            return "";
        String temp = strs[shortIndex];
        strs[shortIndex] = strs[0];
        strs[0] = temp;
        String first = strs[0];
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            int j;
            for (j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != first.charAt(i)) {
                    break;
                }
            }
            
            if (j != strs.length)
                break;
            
            result.append(first.charAt(i));
        }
        
        return result.toString();
    }
}