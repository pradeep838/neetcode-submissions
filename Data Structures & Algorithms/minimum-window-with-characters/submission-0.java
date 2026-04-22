class Solution {
    public String minWindow(String s, String t) {
        
        int left=0;
        int right=0;
        int match_count=0;
        String result="fdsfadfdafdafdafdafadfadfadsf";
        int start=0;
        // int minlen=Integer.MAX_VALUE;
        int min_length=Integer.MAX_VALUE;;
        //convert t in dictionary
        HashMap <Character,Integer> need_map=new HashMap();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            need_map.put(ch,need_map.getOrDefault(ch,0)+1);
        }

        HashMap  <Character,Integer> window_map=new HashMap();
        for(right=0;right<s.length();right++){
             char ch=s.charAt(right);
             window_map.put(ch,window_map.getOrDefault(ch,0)+1);
             
             if(need_map.containsKey(ch) && window_map.get(ch)==need_map.get(ch))
                match_count++;

             while(match_count==need_map.size()){
                if(min_length>right-left+1){
                    start=left;
                    min_length=right-left+1;   
                }
                               
             

             
             char chleft=s.charAt(left);
             left++;
             if(need_map.containsKey(chleft)){
                 if(need_map.get(chleft)==window_map.get(chleft)){
                    match_count--;
                 }
            window_map.put(chleft,window_map.get(chleft)-1);

             }
             }



        }
        return min_length==Integer.MAX_VALUE?"":s.substring(start,start+min_length);
    }
}
