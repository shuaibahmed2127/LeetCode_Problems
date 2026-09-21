class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l = 0;
        int r = n-1;
        int index = n-1;
        while(l<=r){
            if((nums[l]*nums[l]) > (nums[r]*nums[r])){
                res[index--] = (nums[l]*nums[l]);
                l++;
            }else{
                res[index--] = (nums[r]*nums[r]);
                r--;
            }
        }
        return res;
    }
}