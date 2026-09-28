class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int depth = 0;
        int[] a = new int[seq.length()];
        for(int i=0; i<seq.length();i++){
            if(seq.charAt(i) == '('){
                depth++;
                a[i] = depth % 2;
            }else{
                a[i] = depth % 2;
                depth--;
            }
        }
        return a;
    }
}