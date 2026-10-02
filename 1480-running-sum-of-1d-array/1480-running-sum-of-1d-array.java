class Solution {
    public int[] runningSum(int[] nums) {
        for(int a=1;a<nums.length;a++){
            nums[a] += nums[a-1];
        }
        return nums;
    }
}