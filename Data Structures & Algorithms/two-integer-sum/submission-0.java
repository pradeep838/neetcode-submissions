class Solution {
   public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer,Integer> hashMap=new HashMap<Integer, Integer>();
	        for(int i=0;i<nums.length;i++) {
	        	int complement=target-nums[i];
	        	//check for complement
	        	int index=hashMap.getOrDefault(complement,-1);
	        	if(index!=-1) return new int [] {index,i};
                hashMap.put(nums[i],i);
	          
	        }
	        return new int [] {-1,-1};
	    }
}
