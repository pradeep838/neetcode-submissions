class Solution {
    List result=new ArrayList();

    public void dfs(String str,int opening,int closing,int n){
        if(opening == n && closing == n) {
            result.add(str);
            return;
        }
        else if(closing>opening || opening>n || closing>n) 
            return;
       
        dfs(str+"(",opening+1,closing,n);
        dfs(str+")",opening,closing+1,n);  
      }
  
    public List<String> generateParenthesis(int n) {
        dfs("",0,0,n);
        return this.result;
    }
}
