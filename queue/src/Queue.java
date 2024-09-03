
public class Queue {

    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;
    private int nElements ;


    public Queue(int size) {
        maxSize = size ;
        arr = new int[maxSize];
        front = 0;
        rear = -1;
        nElements = 0;
    }

    public void enqueue(int value) {
        if(rear == maxSize - 1) {
            rear = -1;
        }
        arr[++rear] = value;
        nElements++;
    }
    public int dequeue() {
        int temp = arr[front++];
        if(front == maxSize) {
            front = 0;
        }
        nElements--;
        return temp;

    }
    public int peekFront() {
        return arr[front];
    }


    public boolean isFull() {
        return nElements == maxSize;
    }

    public boolean isEmpty() {
        return nElements == 0 ;
    }
    public int size() {
        return nElements;
    }

    public void display() {
        if(nElements == 0) {
            System.out.println("Queue is empty");

        }

        for(int i = front ; i < rear + 1 ; i++) {
            System.out.println(arr[i]);
        }
    }



}
