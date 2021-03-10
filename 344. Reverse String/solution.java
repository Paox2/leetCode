class Solution {
    public void reverseString(char[] s) {
        int halfLength = s.length / 2;
        for (int i = 0; i < halfLength; i++) {
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }
}