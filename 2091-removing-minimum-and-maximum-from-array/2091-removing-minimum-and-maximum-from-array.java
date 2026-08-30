import java.util.*;
class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int minIndex=0,maxIndex=0;
        for(int i=0;i<n;i++){
            if(nums[i] < nums[minIndex]){
                minIndex = i;
            }
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        int a = Math.min(minIndex,maxIndex);
        int b = Math.max(minIndex,maxIndex);
        int fl = b+1;
        int fr = n-a;
        int fbs = (a+1) + (n-b);
        return Math.min(fl,Math.min(fr,fbs));
    }
}