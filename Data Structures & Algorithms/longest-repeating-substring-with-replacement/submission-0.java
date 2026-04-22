class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        HashMap <Character,Integer> freq_map=new HashMap();
        int max_freq=0;
        int result=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq_map.put(ch,freq_map.getOrDefault(ch, 0) + 1);
            max_freq=Math.max(max_freq,freq_map.get(ch));


            //check for valid windowsize
            if(right-left+1-max_freq<=k){
                  result=Math.max(result,right-left+1);
            }else{
                //shrink window 
                freq_map.put(s.charAt(left),(freq_map.get(s.charAt(left))-1));
                left+=1;
            }
            

        }
      return result;
    }
}
