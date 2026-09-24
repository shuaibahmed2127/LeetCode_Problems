class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        for(int s=1;s<nums.length;s++){
            if(nums[s] != nums[s-1]){
                nums[i++] = nums[s];
            }
        }
        return i;
    }
}