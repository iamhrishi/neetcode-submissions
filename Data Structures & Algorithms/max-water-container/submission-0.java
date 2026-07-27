class Solution {
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        int n = heights.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int height = Math.min(heights[i], heights[j]);
                int breadth = j - i;

                int area = height * breadth;

                max = Math.max(max, area); 
            }
        }
        return max;
    }
}
