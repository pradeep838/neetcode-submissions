class Solution {
    public int largestRectangleArea(int[] heights) {
      
        Stack<List<Integer>> st=new Stack();
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
        int top_index=i;
        if(!st.isEmpty()){
              while(!st.isEmpty() && (st.peek().get(1)>heights[i])){
                  List s_top=(ArrayList)st.pop();
                  top_index=(int)s_top.get(0);
                  int barhieght=(int)s_top.get(1);
                  maxArea=Math.max(maxArea,barhieght*(i-top_index));
              }
              st.add(new ArrayList(Arrays.asList(top_index,heights[i])));
         }else {
              st.add(new ArrayList(Arrays.asList(i,heights[i])));
         }
        // System.out.println(st);

       }

       while(!st.isEmpty()){
                  List s_top=(ArrayList)st.pop();
                  int top_index=(int)s_top.get(0);
                  int barhieght=(int)s_top.get(1);
                  maxArea=Math.max(maxArea,barhieght*(heights.length-top_index));
       }

        return maxArea;
    }
}
