class Solution {
    public boolean isValid(String s) {
        Stack stk=new Stack();
        Map key=new HashMap();
        key.put(')','(');
                key.put(']','[');
                        key.put('}','{');


        char ch,top;
        for(int i=0;i<s.length();i++){
           ch= s.charAt(i);
           if(ch=='{' || ch=='(' || ch=='['){
            stk.push(ch);
           }else if (!stk.isEmpty()){
             top = (char)stk.pop();
             if((char)key.get(ch)!=top) return false;


           }else return false;
        }
        if(!stk.isEmpty()) return false;
        return true;
        
    }
}
