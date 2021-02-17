class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int l = 0;
        int r = height.length - 1;
        
        while (l < r) {
            int lh = height[l];
            int rh = height[r];
            area = Math.max(area, Math.min(lh, rh) * (r - l));
            if (lh > rh) {
                r--;
            } else {
                l++;
            }
        }
        
        return area;
    }
}