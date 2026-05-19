class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int right=nums.length-1;
        int mid=(low+right)/2;
        boolean leftSorted=false;
        int upperBound;
        int lowerBound;
        while(low<=right){
             if(nums[mid]==target) return mid;
             else if(nums[low]<=nums[mid]){
                leftSorted=true;
                upperBound=nums[mid];
                lowerBound=nums[low];
             }else{
                leftSorted=false;
                upperBound=nums[right];
                lowerBound=nums[mid];
             }

             if(target>=lowerBound && target<=upperBound){
                // target is in sorted partiion 
                
                    if(target>nums[mid]) low=mid+1;
                    else right=mid-1;
                
                   
                
             
             }else
             {
                if(leftSorted){
                    low=mid+1;
                }else{
                    right=mid-1;
                }

             }

          

             mid=(low+right)/2;

            

        }

        
            return -1;
        
    }
}
