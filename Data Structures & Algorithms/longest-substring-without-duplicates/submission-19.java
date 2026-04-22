class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;

        int vis[]=new int[96];
        int sp=0,lp=0;
        int maxlen=0;
        while(lp<s.length()){
            int ch=s.charAt(lp);
            if(vis[ch-32]==1){
                while(s.charAt(sp)!=ch && sp<lp){
                    vis[s.charAt(sp)-32]=0;
                    sp++;
                }
                sp++;
            }else
            {
               vis[ch-32]=1;

            }
             maxlen= maxlen>(lp-sp+1)?maxlen:lp-sp+1;

            lp++;
        }

       
        return maxlen;
    }
}
