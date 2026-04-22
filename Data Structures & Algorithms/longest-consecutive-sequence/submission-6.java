class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet hset =new HashSet();
        int val,cur=0;
        int res=0;
        for(int i=0;i<nums.length;i++){ 
         hset.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){ 
            //check if starting point of sequence
            val=nums[i];
            cur=0;
            if(hset.contains(val) && !(hset.contains(val-1))){
                while(hset.contains(val)){
                    hset.remove(val);
                    val++;
                    cur++;
                }
            }
            res=Math.max(res,cur);
        }



        return res;

        }
    
}
