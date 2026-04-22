class Solution {
   public int[] topKFrequent(int[] nums, int k) {
		  HashMap<Integer,Integer> frequency=new HashMap<Integer,Integer>();
		  ArrayList [] result=new ArrayList[nums.length+1];
		  for(int i=0;i<result.length;i++) {
			  result[i]=new ArrayList<Integer>();
		  }
		  
		  for(int i=0;i<nums.length;i++) {
			 int currentCount=frequency.getOrDefault(nums[i], 0);
			 frequency.put(nums[i],currentCount+1);
		  }
		  
		  for(Map.Entry<Integer,Integer> entry: frequency.entrySet()) {
			  result[entry.getValue()].add(entry.getKey());
		  }
		  int [] finalResult=new int [k];
		  for(int j=result.length-1;j>0 & k>0;j--) {
			  for(int m=0;m<result[j].size();m++) {
				  finalResult[k-1]=(int) result[j].get(m);
				  k--;
			  }
		  }
		  return finalResult;
		
		  
	           
	            
	    }
}
