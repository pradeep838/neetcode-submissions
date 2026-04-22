class TimeMap {
    private Map<String,Map<Integer,String>> value;
  
    public TimeMap() {
        this.value=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(this.value.containsKey(key)){
            this.value.get(key).put(timestamp,value);
        }else{
            Map tmap=new TreeMap();
            tmap.put(timestamp,value);
            this.value.put(key,tmap);
        }
        
    }
    
    public String get(String key, int timestamp) {

        if (!this.value.containsKey(key)) return "";

        TreeMap<Integer, String> tmap = (TreeMap)this.value.get(key);
        Integer floorKey = tmap.floorKey(timestamp);  // get closest <= timestamp

        if (floorKey == null) return "";
        return tmap.get(floorKey);





        // if(!this.value.containsKey(key)) return "";

        // if(!this.value.get(key).containsKey(timestamp)){
        //     //Map.Entry<Integer,String> e=((TreeMap)this.value.get(key)).lastEntry();
        //     String latest_value=(TreeMap)this.value.get(key).floorKey(timestamp);
        //     int distance=0;
        //     // for(Map.Entry<Integer,String> e:this.value.get(key).entrySet()){
        //     //  if(e.getKey()<timestamp){
        //     //     latest_value=e.getValue();
        //     //  }
       
        //     // }
            
        //     return latest_value;
        // }
        // return this.value.get(key).get(timestamp);
    }
}
