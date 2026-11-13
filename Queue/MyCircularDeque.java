class MyCircularDeque {
    int[] a;
    int s = 0, rear = -1, len = 0;

    public MyCircularDeque(int k) {
        a = new int[k];

    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            s = rear = 0;
        } else {
            s = (s - 1 + a.length) % a.length;
        }

        a[s] = value;
        len++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        } else {

            rear = (rear + 1) % a.length;
        }

        a[rear] = value;
        len++;
        return true;
    }

    public boolean deleteFront() {

        if (isEmpty()) {

            return false;
        }

        if (len == 1) {
            len = 0;
            s = 0;
            rear = -1;
            return true;
        }

        s = (s + 1) % a.length;
        len--;
        return true;

    }

    public boolean deleteLast() {

        if (isEmpty()) {

            return false;
        }

        if (len == 1) {
            len = 0;
            s = 0;
            rear = -1;
            return true;
        }

        rear = (rear - 1 + a.length) % a.length;
        len--;
        return true;

    }

    public int getFront() {
        return !isEmpty() ? a[s] : -1;
    }

    public int getRear() {
        return !isEmpty() ? a[rear] : -1;
    }

    public boolean isEmpty() {
        return len == 0;

    }

    public boolean isFull() {
        return len == a.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */