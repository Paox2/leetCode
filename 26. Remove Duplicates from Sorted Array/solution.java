class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int length = 0;
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[length] != nums[j]) {
                length++;
                nums[length] = nums[j];
            }
        }
        
        return length + 1;
        
    }
}