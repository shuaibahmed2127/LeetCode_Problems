class Solution {
    public int sumOfSquares(int[] nums) {
        int ans = 0;
        for(int num = 1;num <= nums.length; num++){
            if(nums.length % num == 0){
                ans += nums[num-1]*nums[num-1]; 
            }
        }
        return ans;
    }
}