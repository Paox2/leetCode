class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        
        int[] charList = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            charList[s.charAt(i) - 'a'] += 1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if(charList[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}