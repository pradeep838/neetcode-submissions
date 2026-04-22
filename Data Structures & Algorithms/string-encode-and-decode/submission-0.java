class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedstr=new StringBuilder();
        for(String str:strs){
          String len=Character.toString((char)str.length());
          encodedstr.append(len+str);
        }
        return new String(encodedstr);

    }

    public List<String> decode(String str) {
         ArrayList<String> decodedList=new ArrayList();
         int startIndex=0;
         int len=str.length();
         int currentWordlength=-1;
         StringBuilder decodedword=new StringBuilder();
         while(startIndex<len){
            currentWordlength=(int)(str.charAt(startIndex));
            for(int i=1;i<=currentWordlength;i++){
                decodedword.append(str.charAt(i+startIndex));
            }
            decodedList.add(new String(decodedword));
            decodedword=new StringBuilder();
            startIndex+=currentWordlength+1;
         }
         return decodedList;
    }
}
