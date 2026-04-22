class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int last=numbers.length-1;
        int sum;
        while(start<last){
            sum=numbers[start]+numbers[last];
            if(sum==target) return new int[]{start+1,last+1};
            else if(sum<target) start++;
            else 
              last--;
        }
      return new int []{start,last};
    }
}
