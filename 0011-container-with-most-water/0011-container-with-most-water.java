class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,maxwater=0;
        while(l < r){
            int width = r - l;
            int wallheight = Math.min(height[l],height[r]);
            maxwater = Math.max(maxwater,width*wallheight);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxwater;
    }
}