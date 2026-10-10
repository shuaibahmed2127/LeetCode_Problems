class Solution {
    public int maximumValue(String[] strs) {
        int maxx = 0;
        for(String s : strs){
            boolean isNum = true;
            for(int i=0;i<s.length();i++){
                if(!Character.isDigit(s.charAt(i))){
                    isNum = false;
                    break;
                }
            }
            int val;
            if(isNum){
                val = Integer.parseInt(s);
            }else{
                val = s.length();
            }
            maxx = Math.max(maxx,val);
        }
        return maxx;
    }
}