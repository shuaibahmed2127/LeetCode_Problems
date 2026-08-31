class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for(int n : nums){
            answer = answer ^ n;
        }
        return answer;
    }
}