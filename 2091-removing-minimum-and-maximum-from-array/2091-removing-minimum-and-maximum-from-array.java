import java.util.*;
class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        if(nums.length == 2){
            return 2;
        }
        int n=nums.length;
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