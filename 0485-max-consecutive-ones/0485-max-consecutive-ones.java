class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxones = 0;
        for(int c : nums){
            if(c == 1){
                count++;
                maxones = Math.max(maxones,count);
            }else{
                count = 0;
            }
        }
        return maxones;
    }
}