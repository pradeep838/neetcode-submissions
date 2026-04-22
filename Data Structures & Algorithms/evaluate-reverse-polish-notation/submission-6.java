class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack();
        int result=0;
        
        Arrays.stream(tokens).forEach((String item)->{
            if(item.equals("*")){
               int num2=st.pop();
               int num1=st.pop();
               st.push(num1*num2);
            }else  if(item.equals("+")){
               int num2=st.pop();
               int num1=st.pop();
               st.push(num1+num2);
            }else if(item.equals("-")){
               int num2=st.pop();
               int num1=st.pop();
               st.push(num1-num2);
            }else if (item.equals("/")){
               int num2=st.pop();
               int num1=st.pop();
               st.push(num1/num2);
            }else {
                st.push((Integer.parseInt(item)));
            }
            System.out.println(st);
        });
            return (int)st.pop();

    }
}
