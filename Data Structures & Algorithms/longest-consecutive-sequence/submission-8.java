class Solution {
    public int longestConsecutive(int[] nums) {
	       Set<Integer>hashset=new HashSet<Integer>();
	       for (int num : nums) {
	    	    hashset.add(num);
	    	}
	       
	       // now check if each elements is starting of sequecne
	       int result=0;
	       for(int i=0;i<nums.length;i++) {
	    	 //isStartingOfSequence
	    	   int longest=0;
	    	  if(hashset.contains(nums[i]-1)) continue;
	    	  while(hashset.contains(nums[i]+longest)) {
	    		  longest++;
	    	  }
	    	  result=Math.max(result, longest);
	       }
	       return result;

	    }
}
