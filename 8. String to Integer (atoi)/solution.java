class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;
        
        boolean positive = true;
        int index = 0;
        
        if (!Character.isDigit(s.charAt(0))) {
            if ((s.charAt(0) == '-' || s.charAt(0) == '+') && (s.length() > 1 && Character.isDigit(s.charAt(1)))) {
                positive = s.charAt(0) == '-'? false : true;
                index++;
            } else {
                return 0;
            }
        }
        
        int result = 0;
        int length = s.length();
        int extra = positive ? 0 : 1;
        while (index < length) {
            if (!Character.isDigit(s.charAt(index)))
                return result * (positive ? 1 : -1);
            
    		int temp = s.charAt(index) - '0';
            if ((result > Integer.MAX_VALUE / 10) || ((result == Integer.MAX_VALUE / 10) && (temp >= (Integer.MAX_VALUE % 10 + extra))))
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            result = result * 10 + temp;
            index++;
        }
        
        return result * (positive ? 1 : -1);
    }
}