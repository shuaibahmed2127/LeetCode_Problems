import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String ft = strs[0];
        String lt = strs[strs.length - 1];
        int i=0;
        while(i<ft.length() && i<lt.length() && ft.charAt(i) == lt.charAt(i)){
            i++;
        }
        return ft.substring(0,i);
    }
}