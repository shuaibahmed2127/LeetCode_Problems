class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        for(int n : nums1){
            h1.add(n);
        }
        HashSet<Integer> h2 = new HashSet<>();
        for(int n : nums2){
            if(h1.contains(n)){
                h2.add(n);
            }
        }
        int[] res = new int[h2.size()];
        int index = 0;
        for(int num : h2){
            res[index] = num;
            index++;
        }
        return res;
    }
}