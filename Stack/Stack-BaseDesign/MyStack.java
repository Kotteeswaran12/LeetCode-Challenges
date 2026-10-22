
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    public static Queue<Integer> q1;
    public static Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new ArrayDeque<>();
    }

    public static void main(String[] args) {

        MyStack ms = new MyStack();

        ms.push(22);
        ms.push(33);
        ms.push(44);
        ms.push(55);
        int lastele = ms.pop();
        int peek = ms.top();
        boolean empty = ms.empty();

        System.out.println(lastele + " , " + peek + " , " + empty + " ,");

    }

    public void push(int x) {
        q1.add(x);

        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.poll());
            System.out.println(q1);
        }
    }

    public int pop() {

        return q1.poll();

    }

    public int top() {

        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */