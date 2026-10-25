import java.util.Stack;

class MinStack {

    Stack<Long> stack;
    long minVal;

    public MinStack() {
        stack = new Stack<>();
    }

    

    public void push(int value) {

        if (stack.isEmpty()) {
            stack.push((long) value);
            minVal = value;
        } else if (value < minVal) {
            stack.push(2L * value - minVal);
            minVal = value;
        } else {
            stack.push((long) value);
        }

    }

    public void pop() {
        if (stack.isEmpty())
            return;

        long top = stack.pop();

        if (top < minVal) {
            minVal = 2 * minVal - top;
        }

    }

    public int top() {
        if (stack.isEmpty())
            return -1;

        long top = stack.peek();
        return (top < minVal) ? (int)minVal : (int)top;
    }

    public int getMin() {
        if (stack.isEmpty())
            return -1;
        return (int)minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */