class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                int ld = nums[i] % 10;
                c++;
                nums[i]/=10;
            }
            if(c%2 == 0){
                res++;
            }
            c=0;
        }
        return res;
    }
}