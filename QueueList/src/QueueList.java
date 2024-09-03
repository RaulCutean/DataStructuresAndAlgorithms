public class QueueList {

    private LinkList queue;

    public QueueList(){
        queue = new LinkList();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public void insert(int value){
        queue.insertLast(value);
    }
    public int remove(){
        return queue.deleteFirst();
    }

    public void displayQueue(){
        System.out.print("Queue: (front --> rear): ");
        queue.displayList();
    }

}
