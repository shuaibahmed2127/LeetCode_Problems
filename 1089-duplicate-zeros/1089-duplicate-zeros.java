class Solution {
    public void duplicateZeros(int[] arr) {
        /*int possibleZeroDuplicates = 0;
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
        } */
        int[] copy = Arrays.copyOf(arr,arr.length);
        int slow = 0;
        int fast = 0;
        while(fast < arr.length){
            if(copy[slow] == 0){
                arr[fast] = 0;
                fast++;
                if(fast < arr.length){
                    arr[fast] = 0;
                fast++;
                }
                slow++;
            }else{
                arr[fast] = copy[slow];
                slow++;
                fast++;
            }
        }

    }
}