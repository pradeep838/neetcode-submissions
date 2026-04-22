class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque <Integer>dq=new ArrayDeque<Integer>();
        int [] res=new int[nums.length-k+1];
                    int j=0;

        for(int i=0;i<nums.length;i++){
            //sliding window size of k\
            // nums=[1,2,1,0,4,2,6]
            // dq=[1,2]
           while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            System.out.println(dq);

            if(!dq.isEmpty() && i-k==(int)dq.peekFirst()){
                dq.pollFirst();
            }



            //check if last element is not greater than current
          

            if(i-k+1>=0){
              res[j++]=nums[dq.getFirst()];
            }
    }
             return res;

    }
}
