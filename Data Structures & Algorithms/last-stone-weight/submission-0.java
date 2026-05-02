class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });

        for(int stone:stones){
            pq.add(stone);
        }

        while(pq.size()>1){
            int firstMax=pq.poll();
            int secondMax=pq.poll();
            if(firstMax-secondMax==0){
                //destroyed..
            }else{
                pq.add(firstMax-secondMax);
            }
        }
        if(pq.size()==0) return 0;
        else return pq.peek();
    }
}
