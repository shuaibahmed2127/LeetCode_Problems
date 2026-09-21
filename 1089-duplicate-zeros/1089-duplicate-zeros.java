class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleZeroDuplicates = 0;
        int lastIndex = arr.length - 1;
        for(int i=0; i<=lastIndex-possibleZeroDuplicates; i++){
            if(arr[i] == 0){
                if(i == lastIndex - possibleZeroDuplicates){
                    arr[lastIndex] = 0;
                    lastIndex = lastIndex - 1;
                    break;
                }
                possibleZeroDuplicates++;
            }
        }
        int newLastIndex = lastIndex - possibleZeroDuplicates;
        for(int i = newLastIndex; i>=0; i--){
            if(arr[i] == 0){
                arr[i + possibleZeroDuplicates] = 0;
                possibleZeroDuplicates--;
                arr[i + possibleZeroDuplicates] = 0;
            }else{
                arr[i + possibleZeroDuplicates] = arr[i];
            }
        }

    }
}