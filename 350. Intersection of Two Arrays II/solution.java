class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int result = 0;
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                nums1[result] = nums1[i];
                result++;
                i++;
                j++;
            }
        }
        
        return Arrays.copyOf(nums1, result);
    }
}