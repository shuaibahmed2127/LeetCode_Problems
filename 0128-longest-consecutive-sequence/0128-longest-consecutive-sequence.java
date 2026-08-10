class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 0){
            return 0;
        }
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int currNum = num;
                int c = 1;
                while(set.contains(currNum + 1)){
                    currNum ++;
                    c++;
                }
                longest = Math.max(c,longest);
            }
        }
        return longest;
    }
}