class Solution {
     public int maxProfit(int[] prices) {
	      int sellDay;
	      int maxProfit=0;
	      int currentBuyIndex=0;
	      for(int i=1;i<prices.length;i++) {
	    	  int currentProfit=prices[i]-prices[currentBuyIndex];
	    	  maxProfit=Math.max(maxProfit, currentProfit);
	    	  if(prices[currentBuyIndex]>prices[i])
	    		  currentBuyIndex=i;
	    	  
	      }
	      return maxProfit;
}}
