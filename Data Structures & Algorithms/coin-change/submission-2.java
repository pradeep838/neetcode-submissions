class Solution {

    public static int solution(int [] coins,int index,int target){
    	//System.out.println("calling function\t"+ index+"\t"+target);
        if(target==0) return 0;
        else if (index>=coins.length || target <0) return Integer.MAX_VALUE-1;
        if(target>=coins[index]){
            int leftvalue=solution(coins,index,target-coins[index]);
            int rightvalue=solution(coins,index+1,target);
            if(leftvalue>=0) leftvalue+=1;
            return Math.min(leftvalue, rightvalue);
        }else{
            return solution(coins,index+1,target);
        }
    }
    public static  int coinChange(int[] coins, int amount) {
        
        int result= solution(coins,0,amount);
       return result==Integer.MAX_VALUE-1?-1:result;
    }
    
    // public static void main(String[] args) {
	// 	int arr[]=new int [] {1,2,5};
	// 	int result=coinChange(arr,11);
	// 	System.out.println(result);
	// }
}
