class Solution {
    List<List<Integer>> rs=new ArrayList();
    public  void createSubset(int[] nums,int counter,List result){
        if( counter>=nums.length)
        {
                  this.rs.add(new ArrayList(result));
                  return;

        }
        result.add(nums[counter]);
        createSubset(nums,counter+1,result);
        result.remove(result.size()-1);
        createSubset(nums,counter+1,result);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        createSubset(nums,0,new ArrayList());
        return this.rs;

    }
}
