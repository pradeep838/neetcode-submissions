class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        TreeMap<Integer,Integer> hmap=new TreeMap(Comparator.reverseOrder());

         for(int i=0;i<position.length;i++){
             hmap.put(position[i],speed[i]);
         }
         //sort in reversing order
         System.out.println(hmap);
         //check for fleet
        Stack <Float>st=new Stack();
        for (Integer key : hmap.keySet()) {
            st.add((float)(target-key)/hmap.get(key));
            if(st.size()>=2 && st.get(st.size()-1)<= st.get(st.size()-2)){
                st.pop();
            }
         }
         return st.size();



    }
}
