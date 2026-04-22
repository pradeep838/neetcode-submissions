class Solution {
    public int maxArea(int[] heights) {
       int l=0;
       int r=heights.length-1;
       int maxarea=0;
       while(l<r){
          maxarea=Math.max(maxarea,(r-l)*Math.min(heights[l],heights[r]));
          //move smaller value 
          if(heights[l]<heights[r]) l++;
          else r--;
       }
       return maxarea;
    }
}
