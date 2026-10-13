import java.util.Arrays;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        long answer = 0;
        int mid = n / 2;
        for (int i = 0; i < mid; i++) {
            answer -= nums[i];
        }
        for (int i = mid; i < n; i++) {
            answer += nums[i];
        }
        return answer;
    }
}