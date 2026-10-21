class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        for(int i=1;i<n;i++){
            if(s.charAt(i) < s.charAt(i-1)){
                sorted = false;
                break;
            }
        }
        if(sorted){
            return 0;
        }
        if(n==2){
            return -1;
        }
        char minchar = 'z',maxchar = 'a';
        for(int i=0;i<n;i++){
            if(s.charAt(i) < minchar){
                minchar = s.charAt(i);
            }
            if(s.charAt(i) > maxchar){
                maxchar = s.charAt(i);
            }
        }
        if(s.charAt(0) == minchar || s.charAt(n-1) == maxchar){
            return 1;
        }
        for(int i=1;i<n-1;i++){
            if(s.charAt(i) == minchar || s.charAt(i) == maxchar){
                return 2;
            }
        }
        return 3;
    }
}