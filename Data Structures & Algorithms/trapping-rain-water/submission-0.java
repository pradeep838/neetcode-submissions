class Solution {
    public int trap(int[] height) {
         int [] prefix=new int [height.length];
         int maxh=0;
         for(int i=0;i<height.length;i++){
           prefix[i]=maxh;
           maxh=maxh>height[i]?maxh:height[i];
         }
          int water=0;
          int temp=0;
          int maxR=0;
          for(int i=height.length;i>0;i--){
           temp=Math.min(prefix[i-1],maxR)-height[i-1];
           maxR=maxR>height[i-1]?maxR:height[i-1];
           if(temp>0)
              water+=temp;

         }
         return water;
        
    }
}
