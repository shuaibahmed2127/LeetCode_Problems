class Solution {
    public int majorityElement(int[] nums) {
        int n = 0;
        int c = 0;
        for(int num : nums){
            if(c == 0){
                n = num;
            }
            if(num == n){
                c++;
            }else{
                c--;
            }
        }
        return n;
    }
}