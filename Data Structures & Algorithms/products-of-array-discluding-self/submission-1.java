class Solution {
    public int[] productExceptSelf(int[] nums) {
		  
		    //2 3 4 5 6 
	       int [] prefixarr=new int [nums.length];
	       int [] resultArr=new int [nums.length];
	       prefixarr[0]=1;
	       for(int i=1;i<nums.length;i++) {
	    	   prefixarr[i]=prefixarr[i-1]*nums[i-1];
	       }
	       int suffixValue=1;
	       for(int i=nums.length-1;i>=0;i--) {
	    	   resultArr[i]=suffixValue*prefixarr[i];
			   suffixValue*=nums[i];
	       }
	       return resultArr;
	       
	       
	    }
}  
