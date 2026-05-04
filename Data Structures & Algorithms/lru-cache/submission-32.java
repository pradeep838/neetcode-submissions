class LRUCache {
    private int size;
    private int currentSize;
    private HashMap <Integer,Node> reg;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.size=capacity;
        this.reg=new HashMap<Integer,Node>();
        head=null;
        this.currentSize=0;
    }
    
    public static class Node{
        int key;
        int data;
        Node next;
        Node previous;

        Node(int key,int value){
            this.key=key;
            this.data=value;
        }
    }
    public int get(int key) {

        System.out.println("calling key-"+key);
        Node value=reg.getOrDefault(key,null);
        if(value==null) return -1;
     
        moveToHead(value);
        // System.out.println("moveToHeadShouldBe"+value.data);
        // System.out.println("moveToHead"+head.data);
        display(head);
        return head.data;
        
      
    }

    private void moveToHead(Node value){
    //    if(head==null) return;
       Node temp=head;
       if(value.previous==null) return;

	  Node next=value.next;
      Node previous=value.previous;

        value.previous=null;
        head.previous=value;
        value.next=head;
        head=value;
	     
        previous.next=next;
        if(next!=null)
            next.previous=previous;
        else{
            tail=previous;
        }
    }
    
    public void put(int key, int value) {
        //checks if key exist in the map
        Node  existedValue=reg.getOrDefault(key,null);
        Node newNode=null;
        if(existedValue==null){
            newNode=new Node(key,value);
            reg.put(key,newNode);  
        }else{
          newNode=existedValue;
          newNode.data=value;
          moveToHead(newNode);
          return;
        }
           
      
           
      
       
        if(head==null) // empty with nothing
        {  
             this.head=newNode;
             this.tail=newNode;
           
        }
        else
        {   
            Node temp=this.head;
            this.head=newNode;
            newNode.next=temp;
            temp.previous=newNode;
            
           
        }
        this.currentSize++;
        // check for size 
        if(this.currentSize>this.size){
           
           removeTailNode(this.tail);
           
        }
        System.out.println(this.currentSize);
        display(head);

    }

    private void display(Node head){
        Node current=head;
        while(current!=null){
           System.out.print("-->"+current.data);
           current=current.next;
        }
         System.out.println();
          
    }

    private void removeTailNode(Node node){
        reg.remove(node.key);
        this.currentSize--;
        if(head==null) return;
        else if (node.next==null  && node.previous==null){
               head=null;  //only one node is there
               tail=null;
               return;
        }
            node.previous.next=null;
            tail=node.previous;
            return;
        
        
       
      
    }
}
