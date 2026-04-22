class Solution {

    public int calculateHour(int [] piles,int k){
        int hour=0;
        for(int i=0;i<piles.length;i++){
            hour+=Math.ceil((double)piles[i]/k);
        }
        return hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        //find max
       int max=0;
       for(int i=0;i<piles.length;i++){
          max=Math.max(piles[i],max);
       }
       int left=1;
       int right=max;
       int result=right;
       
       while(left<=right){
        int mid=(left+right)/2;
        int th=calculateHour(piles,mid);
        if(th<=h){
           result=mid;
           right=mid-1;
        }else{{
            left=mid+1;
        }
     }
       }

       //apply binary serch...
     
       return result;
}
}
