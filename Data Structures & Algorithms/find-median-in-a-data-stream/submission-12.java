class MedianFinder {
     PriorityQueue maxpq,minpq;
    //  PriorityQueue
    
    public MedianFinder() {
         maxpq=		new PriorityQueue(Collections.reverseOrder());
         minpq=new PriorityQueue();
    }
    
   
//     public void addNum(int num) {
//            if(maxpq.isEmpty() || num<=(int)maxpq.peek()){
//                 maxpq.add(num);
//            }else{
//                 minpq.add(num);
//            }
//            if (maxpq.size() > minpq.size() + 1) {
//               minpq.add(maxpq.poll());
// }

//             if (minpq.size() > maxpq.size()) {
//                 maxpq.add(minpq.poll());
//             }
            
           
//     }

public void addNum(int num) {
    if (maxpq.isEmpty() || num <= (int)maxpq.peek()) {
        maxpq.add(num);
    } else {
        minpq.add(num);
    }

    if (maxpq.size() > minpq.size() + 1) {
        minpq.add(maxpq.poll());
    }

    if (minpq.size() > maxpq.size()) {
        maxpq.add(minpq.poll());
    }
}
    
    public double findMedian() {
        if (maxpq.size() > minpq.size()) {
        return (int)maxpq.peek();
    } else {
        return ((int)maxpq.peek() +(int) minpq.peek()) / 2.0;
    }
    }
   
}
