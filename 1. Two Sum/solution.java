class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] position = new int[2];
        outer: for (int i = 0; i < (nums.length - 1); i++) {
            int second = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == second) {
                    position[0] = i;
                    position[1] = j;
                    break outer;
                }
            }
        }
            
        return position;
    }
}