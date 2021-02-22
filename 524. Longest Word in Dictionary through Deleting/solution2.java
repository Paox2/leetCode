class Solution {
    public String findLongestWord(String s, List<String> d) {
        
        Collections.sort(d, (a,b) -> (a.length() == b.length()) ? a.compareTo(b) : b.length()-a.length());
        
        for (String t : d) {
            
            int index = -1;
            for (int i = 0; i < t.length(); i++) {
                index = s.indexOf(t.charAt(i), index+1);
                if (index == -1)
                    break;
            }
            
            if (index != -1)
                return t;
        }
        
        return "";
    }
}