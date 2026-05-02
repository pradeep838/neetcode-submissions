class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        int count=0;
        while(k>1){
            pq.poll();
            k--;
        }
        return pq.peek();
    }
}
