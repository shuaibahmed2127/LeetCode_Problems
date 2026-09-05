class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] rMin = new int[n];
        rMin[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--){
            rMin[i] = Math.min(nums[i],rMin[i+1]);
        }
        int lMax = 0;
        for(int i=0;i<n;i++){
            lMax = Math.max(lMax,nums[i]);
            int s = lMax - rMin[i];
            if(s<=k) return i;
        }
        return -1;
    }
}