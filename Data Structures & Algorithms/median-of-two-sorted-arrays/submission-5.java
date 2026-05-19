class Solution {
    
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	        int temp[];
	        // num1 will be smaller and num2 will be larger array
	        if(nums1.length>nums2.length){
	            temp=nums1;
	            nums1=nums2;
	            nums2=temp;
	        }


	        int l=0;
	        int r=nums1.length-1;
	        int total=nums1.length+nums2.length;
	        int half=total/2;
	        while(true){
	           
	            int i=(int)Math.floor((l+r)/2.0);
	            int j=half-(i+1)-1;  // to adjust zero base indexing
	            System.out.println(l+"\t"+r+"\t"+i+"\t"+j);
	            int num1left= i<0?(1)*Integer.MIN_VALUE:nums1[i];
	            int num1right=i+1 >= nums1.length?Integer.MAX_VALUE:nums1[i+1];
	            int num2left=j<0?(1)*Integer.MIN_VALUE:nums2[j];
	            int num2right=j+1>=nums2.length?Integer.MAX_VALUE:nums2[j+1];

	            // check if partitions correct
	            if(num1left<=num2right && num2left<=num1right){
	                if(total%2==1) return Math.min(num1right,num2right);
	                else {
	                  return  (Math.max(num1left,num2left)+Math.min(num1right,num2right))/2.0;
	                }
	            }else if(num1left>num2right){
	                r=i-1;
	            }else
	                l=i+1;

	        }
	        // return -1;
	    }
}
