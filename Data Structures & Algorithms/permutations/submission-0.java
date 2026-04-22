class Solution {
    private List<List<Integer>> res=new ArrayList();
    public void swap(int num [],int i,int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
        // return num;
    }
    public void dfs(int [] nums,int index,List al){
        if(index>=nums.length)
        {
                     res.add(new ArrayList<Integer>(Arrays.stream(nums).boxed().collect(Collectors.toList())));
                     return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            dfs(nums,index+1,al);
            swap(nums,index,i);
        }
        return;

    }
    public List<List<Integer>> permute(int[] nums) {
        dfs(nums,0,new ArrayList());
        return this.res;
    }
}
