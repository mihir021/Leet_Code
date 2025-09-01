// LeetCode 225. Implement Stack using Queues
class MyStack {
    int top = -1;
    int a[] = new int[10];
    int size = a.length;
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
        System.out.println(param_2); // 3
        System.out.println(param_3); // -1
        System.out.println(param_4); // true
    }

    public MyStack() {
        // Constructor to initialize the stack
        // No need to do anything here as the array is already initialized
    }

    public void push(int x) {

        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        a[top] = x;

    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int x = a[top];
        top--;
        return x;

    }

    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top];
    }

    public boolean empty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
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