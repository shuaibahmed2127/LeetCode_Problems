class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1;
        for(int s = m+n - 1; s>=0; s--){
            if(j < 0) break;
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[s] = nums1[i];
                i--;
            }else{
                nums1[s] = nums2[j];
                j--;
            }
        }
    }
}