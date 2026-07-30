class MinStack {
    private int[] stack;
    private int top;

    public MinStack() {
        this.stack = new int[2000];
        this.top = -1;
    }
    
    public void push(int val) {
        if(top == stack.length - 2)
            return;
        
        int currentMin = (top == - 1) ? val : Math.min(val, stack[top]);
        stack[++top] = val;
        stack[++top] = currentMin;
    }
    
    public void pop() {
        if(top == -1)
            return;
        top-=2;
    }
    
    public int top() {
        if(top == - 1)
            return -1;
        return stack[top - 1];
    }
    
    public int getMin() {
        if(top == -1)
            return -1;
        return stack[top];
    }
}
