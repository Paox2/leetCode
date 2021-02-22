class Solution {
    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        
        for (String t : d) {
            if (t.length() < longestWord.length() || (t.length() == longestWord.length() && t.compareTo(longestWord) >= 0) || t.length() > s.length() || (t.length() == s.length() && t.compareTo(s) != 0)) 
                continue;
            
            int index = -1;
            for (int i = 0; i < t.length(); i++) {
                index = s.indexOf(t.charAt(i), index+1);
                if (index == -1)
                    break;
            }
            
            if (index != -1)
                longestWord = t;
        }
        
        return longestWord;
    }
}