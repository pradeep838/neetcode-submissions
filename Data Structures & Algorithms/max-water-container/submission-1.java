class Solution {
    public int maxArea(int[] heights) {
	        int l=0,r=0;
	        r=heights.length-1;
	        int maxArea=0;
	        while(l<r) {
	        	int minHeight=Math.min(heights[l], heights[r]);
	        	int currentArea=(r-l)*minHeight;
	        	if(heights[l]<heights[r])l++;
	        	else r--;
	        	maxArea=Math.max(maxArea, currentArea);
	        }
	        return maxArea;
	    }
}
