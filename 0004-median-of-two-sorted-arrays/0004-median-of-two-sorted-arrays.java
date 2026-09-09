class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] res = new int[m+n];
        int a = 0, s = 0, ind = 0;
        while(a<m && s<n){
            if(nums1[a] <= nums2[s]){
                res[ind++] = nums1[a];
                a++;
            }else{
                res[ind++] = nums2[s];
                s++;
            }
        }
        while(a<m){
            res[ind++] = nums1[a];
                a++;
        }
        while(s<n){
            res[ind++] = nums2[s];
                s++;
        }
        int resl = res.length;
        int l = 0, r = res.length-1;
        int mid = l+(r-l) / 2;
        if(resl%2 == 0){
            double ans = (double)(res[mid] + res[mid + 1]) / 2;
            return ans;
        }else{
            double ans = res[mid];
            return ans;
        }
    }
}