class Solution {
    List<List<Integer>>  res=new ArrayList();

    public void dfs(int [] nums,int target,int index,List path){
        if(target==0){
            res.add(new ArrayList(path));
            return;
        }
        if(target<0 || index>=nums.length) return;

        path.add(nums[index]);
        dfs(nums,target-nums[index],index+1,path);
        path.remove(path.size()-1);
        while( index+1<nums.length && nums[index]==nums[index+1])
             index++;
        dfs(nums,target,index+1,path);
        return;

    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        dfs(nums,target,0,new ArrayList());
        return this.res;
    }
}
