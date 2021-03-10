class Solution {
    public int reverse(int x) {
                
        long result = 0;
        boolean positive = x > 0 ? true : false;
        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            result = result * 10 + temp;
        }
        
        if (result == 0 || result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }
}