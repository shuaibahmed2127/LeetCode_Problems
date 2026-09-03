class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        for(int n : nums1){
            if((n&1)!=0){
                minOdd = Math.min(n,minOdd);
            }
        }
        if(minOdd == Integer.MAX_VALUE) return true;
        for(int m : nums1){
            if(m % 2 == 0 && m < minOdd) return false;
        }
        return true;
    }
}