class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top_row=0;
        int m=matrix.length;
        int n=matrix[0].length;
        //find exact row where target can we found
        int bottom_row=m-1;
        int midrow=(top_row+bottom_row)/2;
        while(top_row<=bottom_row){
            if(matrix[midrow][0]<=target && matrix[midrow][n-1]>=target) break;
            else if (matrix[midrow][n-1]<target) top_row=midrow+1;
            else if (matrix[midrow][0]>target) bottom_row=midrow-1;
            midrow=(top_row+bottom_row)/2;
        }
        int mid=0;
        int low=0;
        int high=n-1;
        System.out.println(midrow);
        while(low<=high){
            mid=(low+high)/2;
            if(matrix[midrow][mid]==target) return true;
            else if (matrix[midrow][mid]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
