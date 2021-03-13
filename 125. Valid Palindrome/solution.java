class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1)
            return true;
        
        s = s.toLowerCase();
        int front = 0;
        int end = s.length() - 1;
        char currentStart = s.charAt(front);
        char currentEnd = s.charAt(end);
        
        while (front < end) {
            if (Character.isLetterOrDigit(currentStart)) {
                if (!Character.isLetterOrDigit(currentEnd)) {
                    end--;
                    currentEnd = s.charAt(end);
                } else if (currentEnd == currentStart) {
                    front++;
                    currentStart = s.charAt(front);
                    end--;
                    currentEnd = s.charAt(end);
                } else {
                    return false;
                }
            } else {
                front++;
                currentStart = s.charAt(front);
            }
        }
        return true;
    }
}