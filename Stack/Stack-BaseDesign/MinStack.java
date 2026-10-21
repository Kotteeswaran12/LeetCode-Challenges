
import java.util.Stack;

class MyQueue {

    public Stack<Integer> stackIn;
    public Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();

        // stack.push(22);
        // stack.push(33);
        // stack.push(44);

        // System.out.println(stack.remove(0));
        // System.out.println(stack.get(0));
        // System.out.println(stack.isEmpty());

    }

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();

        mq.push(20);
        mq.push(22);
        mq.push(24);

        int pop = mq.pop();
        int peek = mq.peek();
        boolean empty = mq.empty();

        System.out.println(pop + " , " + peek + " ," + empty);
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {

        peek();
        return stackOut.pop();
    }

    public int peek() {

        if(stackOut.isEmpty()){
            while(!stackIn.empty()){
                stackOut.push(stackIn.pop());
            }
        }

        return stackOut.peek();

    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */