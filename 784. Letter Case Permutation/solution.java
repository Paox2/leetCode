class Solution {
    private int length;
    
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        length = S.length();
        
        if(length == 0) {
            return list;
        }
        
        helper(S.toCharArray(), list, 0);
        return list;
    }
    
    private void helper(char[] s, List<String> list, int index) {
        if(index == length) {
            list.add(new String(s));
            return;
        }
        
        if(Character.isDigit(s[index])) {
            helper(s, list, index+1);
        } else {
            s[index] = Character.toLowerCase(s[index]);
            helper(s, list, index+1);
            
            s[index] = Character.toUpperCase(s[index]);
            helper(s, list, index+1);
        }
    }
}