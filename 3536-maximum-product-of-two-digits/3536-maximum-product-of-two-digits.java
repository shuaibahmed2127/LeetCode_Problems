class Solution {
    public int maxProduct(int n) {
        int l = 0;
        int sl = 0;
        while(n>0){
            int ld=n%10;
            if(ld>l){
                sl = l;
                l=ld;
            }else{
                if(ld>sl){
                    sl=ld;
                }
            }
            n=n/10;
        }
        return l*sl;
    }
}