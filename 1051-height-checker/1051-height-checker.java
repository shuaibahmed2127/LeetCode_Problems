class Solution {
    public int heightChecker(int[] heights) {

        int[] count = new int[101];

        // Count each height
        for (int h : heights) {
            count[h]++;
        }

        int answer = 0;
        int index = 0;

        // Create sorted order
        for (int h = 1; h <= 100; h++) {

            while (count[h] > 0) {

                if (heights[index] != h) {
                    answer++;
                }

                index++;
                count[h]--;
            }
        }

        return answer;
    }
}