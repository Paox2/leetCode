class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        int[] list = new int['z'-'a'+1];
        for (int i = 0; i < s.length(); i++) {
            list[s.charAt(i) - 'a']++;
            list[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < ('z'-'a'+1); i++) {      
            if(list[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}