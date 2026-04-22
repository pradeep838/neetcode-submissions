class Solution {
    List<List<Integer>>  res=new ArrayList();

    public void dfs(int [] nums,int target,int index,List path){
        if(target<0 || index>=nums.length) return;
        if(target==0){
            res.add(new ArrayList(path));
            return;
        }
        path.add(nums[index]);
        dfs(nums,target-nums[index],index,path);
        // dfs(nums,target-nums[index],index+1,path);
        path.remove(path.size()-1);
        dfs(nums,target,index+1,path);
        return;

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        dfs(nums,target,0,new ArrayList());
        return this.res;
    }
}
