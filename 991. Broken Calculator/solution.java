class Solution {
    public int brokenCalc(int X, int Y) {
        if (X >= Y) {
            return X - Y;
        }
        
        int times = 0;
        while (X < Y) {
            times += 1;
            
            if (Y % 2 == 0)
                Y /= 2;
            else
                Y++;
        }
        
        if (X > Y) {
            times += X - Y;
        }
        
        return times;
    }
}