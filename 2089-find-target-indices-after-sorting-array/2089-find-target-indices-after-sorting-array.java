class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smaller = 0, equal = 0;
        for(int n : nums){
            if(n < target){
                smaller++;
            } else if(n == target){
                equal++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = smaller; i < smaller + equal; i++){
            res.add(i);
        }
        return res;
    }
}