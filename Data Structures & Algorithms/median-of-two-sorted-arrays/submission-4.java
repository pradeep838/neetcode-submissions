class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int [] temp;
       if(nums1.length>nums2.length){
         temp=nums1;
         nums1=nums2;
         nums2=temp;
       }
       int m=nums1.length;
       int n=nums2.length;

       int low=0,high=m;
       int partionX,partionY;
       int maxleftX,minrightX,maxleftY,minrightY;
      
       while(low<=high){

          partionX=(low+high)/2;
          partionY=(m+n+1)/2-partionX;

          maxleftX=partionX==0?Integer.MIN_VALUE:nums1[partionX-1];
          minrightX=partionX==m?Integer.MAX_VALUE:nums1[partionX];

          maxleftY=partionY==0?Integer.MIN_VALUE:nums2[partionY-1];
          minrightY=partionY==n?Integer.MAX_VALUE:nums2[partionY];
          System.out.println(maxleftX+" "+minrightX+" "+maxleftY+" " +minrightY);
          if(maxleftX<minrightY && maxleftY<minrightX){
            //true index found
            if((m+n)%2==0){
                    double val =Math.max(maxleftX,maxleftY)+Math.min(minrightX,minrightY);
                    val=val/2.0;
                    return val;

            }else{
                return Math.max(maxleftX,maxleftY);
            }
          }else if(maxleftX>minrightY){
            high=partionX-1;
          }else{
            low=partionX+1;
          }


       }

       return 0.0;


    }
}
