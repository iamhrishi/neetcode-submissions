class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int max = Integer.MIN_VALUE;

        while(left < right){
            int height = Math.min(heights[left], heights[right]);
            int bredth = right - left;

            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
            max = Math.max(max, height * bredth);
        }
        return max;
    }
}
