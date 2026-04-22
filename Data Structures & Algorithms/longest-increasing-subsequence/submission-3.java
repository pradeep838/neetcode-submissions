class Solution {
    public int dfs(int []nums,int cindex,int prevIndex){
       if (cindex == nums.length) return 0;

        int take = 0;
        if (prevIndex == -1 || nums[cindex] > nums[prevIndex]) {
            take = 1 + dfs(nums, cindex + 1, cindex);
        }

        int notTake = dfs(nums, cindex + 1, prevIndex);

        return Math.max(take, notTake);
               
    }
    public int lengthOfLIS(int[] nums) {
        
        return dfs(nums,0,-1);
    }
}
