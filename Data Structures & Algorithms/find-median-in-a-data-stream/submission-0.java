class MedianFinder {
    private PriorityQueue<Integer> maxq;
    private PriorityQueue<Integer> minq;

    public MedianFinder() {
            this.maxq=new PriorityQueue(Collections.reverseOrder());
            this.minq=new PriorityQueue();

    }
    
    public void addNum(int num) {
        maxq.add(num);
        // Move top of maxq to minq to maintain order
        minq.add(maxq.poll());

        // Ensure maxq has equal or 1 more than minq
        if (maxq.size() < minq.size()) {
            maxq.add(minq.poll());
        }
    }
    
    public double findMedian() {
        System.out.println(Math.abs(maxq.size()-minq.size()));
        if(Math.abs(maxq.size()-minq.size())>0){
            return (double) maxq.peek();
        }else
            return Double.valueOf(((double)minq.peek()+(double)maxq.peek())/2);
    }
}
