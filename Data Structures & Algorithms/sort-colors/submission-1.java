class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[r]==2) r--;
            else if(nums[l]==0 || nums[l]==1){ l++; }
            else {
                 int temp=nums[r];
                 nums[r]=nums[l];
                 nums[l]=temp;
            }
        }

         l=0;
         r=nums.length-1;
         while(nums[r]==2 & r>0) r--;
         while(l<r){
            if(nums[r]==1) r--;
            else if(nums[l]==0){ l++; }
            else {
                 int temp=nums[r];
                 nums[r]=nums[l];
                 nums[l]=temp;
            }
        }
        
    }
}