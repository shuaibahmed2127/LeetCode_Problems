class Solution {
    public int missingNumber(int[] nums) {
        int xOne=0;
        int xTwo =0;
        for(int i=0; i<=nums.length;i++){
            xOne = xOne ^ i;
        }
        for(int num : nums){
            xTwo = xTwo ^ num;
        }
        return xOne^xTwo;
    }
}