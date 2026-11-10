class MyCircularQueue {
    final int[] a;
    int front = 0, rear = -1, len = 0;

    public MyCircularQueue(int k) {
        a = new int[k];
    }

    public boolean enQueue(int value) {
        if (!isEmpty()) {
            rear = (rear + 1) % a.length;
            a[rear] = value;
            len++;
            return true;
        }

        return false;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            front = (front + 1) % a.length;
            len--;
            return true;
        }

        return false;
    }

    public int Front() {
        return isEmpty() ? -1 : a[front];
    }

    public int Rear() {
        return isEmpty() ? -1 : a[rear];
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public boolean isFull() {
        return len == a.length;
    }

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(10);
        
    }
}
