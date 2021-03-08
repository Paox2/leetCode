class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        while (i < nums.length && nums[i] != 0) {
            
            i++;
        }
        
        int pos = i;
        i++;
        
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
            i++;
        }
        
        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
    }
}