class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0,odd=1;
        while(even < nums.length && odd < nums.length){
            if(nums[even] % 2 == 0){
                even+=2;
            }else if(nums[odd] % 2 != 0){
                odd+=2;
            }else{
                int t = nums[odd];
                nums[odd] = nums[even];
                nums[even] = t;
                even+=2;
                odd+=2;
            }
        }
        return nums;
    }
}