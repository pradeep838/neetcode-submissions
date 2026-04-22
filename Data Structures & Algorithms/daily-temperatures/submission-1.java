class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack <Integer> stk=new Stack();
        int [] next=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            if(stk.isEmpty()) stk.push(i);
            while(!stk.isEmpty() && temperatures[stk.peek()]<temperatures[i]){
                next[stk.peek()]=i-stk.peek();
                stk.pop();
                
            }
            stk.push(i);
           
        }
         
        return next;

    }
}
