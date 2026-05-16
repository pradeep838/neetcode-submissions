class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // first find the row 
        int low=0;
        int high=matrix.length-1;
        int mid=(low+high)/2;

        while(low<=high){
            if(target==matrix[mid][0]) return true;
            else if(target<matrix[mid][0]) high=mid-1;
            else low=mid+1;
            
            mid=(low+high)/2;
        }

        int r_low=0;
        int r_high=matrix[0].length-1;
        int  r_mid=(r_low+r_high)/2;

        
        while(r_low<=r_high){
            if(target==matrix[mid][r_mid]) return true;
            else if(target<matrix[mid][r_mid]) r_high=r_mid-1;
            else r_low=r_mid+1;
            
            r_mid=(r_low+r_high)/2;
        }
        
        return false;
    }
}
