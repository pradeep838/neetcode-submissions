class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue< int[]> pq=new PriorityQueue<int []>(new Comparator<int []>(){
               public int compare( int [] a,int [] b){
                     int distance1=a[0]*a[0]+a[1]*a[1];
                     int distance2=b[0]*b[0]+b[1]*b[1];
                     return distance1-distance2;
               }
        });

        for(int i=0;i<points.length;i++){
            pq.add(points[i]);
        }
        int count=0;
        int [][] result=new int[k][2];
        while(count<k){
             result[count++]=pq.poll();
        }


          return result;
    }
}
