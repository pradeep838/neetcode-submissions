class Solution {
    private int compute(int n){
        int result=0;
        while(n!=0){
            result+=(n%10)*(n%10);
            n=n/10;
        }
        return result;
    }
    public boolean isHappy(int n) {
        HashSet hset=new HashSet();
        while(true){
          
           if(n==1) return true;
           else if(hset.contains(n)) return false;
           else{ 
                  hset.add(n);
                 n=compute(n);
                 System.out.println(n);
                
           }
             
            
        }
    }
}
