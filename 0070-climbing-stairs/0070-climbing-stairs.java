class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int prev = 2;
        int prevBefore = 1;
        for(int i = 3; i<=n; i++){
            int curr = prev + prevBefore;
            prevBefore = prev;
            prev = curr;
        }
        return prev;
    }
}