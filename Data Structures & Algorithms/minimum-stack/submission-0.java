class MinStack {
    Stack plist1;
    Stack pminlist;
    public MinStack() {
        this.plist1=new Stack();
        this.pminlist=new Stack();
    }
    
    public void push(int val) {
        if(this.pminlist.isEmpty())
            this.pminlist.push(val);
        else if((int)(this.pminlist.peek())<val)
             this.pminlist.push(this.pminlist.peek());
        else
        this.pminlist.push(val);
        this.plist1.push(val);
    }
    
    public void pop() {
          this.plist1.pop();
          this.pminlist.pop();
    }
    
    public int top() {
         return (int)this.plist1.peek();
    }
    
    public int getMin() {
        return (int)this.pminlist.peek();
    }
}
