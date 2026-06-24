class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int left=i;
            while(left>0 && heights[left-1]>=height){
                left--;
            }
            int right=i;
            while(right < heights.length - 1 && heights[right + 1] >= height){
                right++;
            }
            int width=right-left+1;
            maxarea=Math.max(maxarea,height*width);
           
        }
        return maxarea;
    }
}
