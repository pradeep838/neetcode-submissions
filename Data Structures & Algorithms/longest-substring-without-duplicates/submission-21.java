class Solution {
   public int lengthOfLongestSubstring(String s) {
	      // sliding window technique
		  int l=0;

		  HashMap<Character, Integer> frequencyCount=new HashMap<Character, Integer>();
		  int longest=0;
		  for(int i=0;i<s.length();i++) {
			  int freq=frequencyCount.getOrDefault(s.charAt(i),0);
			  if(freq==0) {
				  frequencyCount.put(s.charAt(i), 1);
			  }else {
				  while(frequencyCount.get(s.charAt(i))!=0) {
					  int freql=frequencyCount.get(s.charAt(l));
					  frequencyCount.put(s.charAt(l),--freql);
					  l++;
				  }
				  frequencyCount.put(s.charAt(i), 1);
			  }
			  int currentWindowSize=i-l+1;
			  longest=Math.max(longest, currentWindowSize);
		  }
		  return longest;
		  
		  
}
}
