class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxWater = 0;
        while(l < r){
            int width = r - l;
            int containerHeight = Math.min(height[l],height[r]);
            int area = width * containerHeight;
            maxWater = Math.max(maxWater,area);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxWater;
    }
}