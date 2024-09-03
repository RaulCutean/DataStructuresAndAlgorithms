public class Main {
    public static void main(String[] args) {
        QueueList queue = new QueueList();

        queue.insert(10);

        queue.insert(20);

        queue.insert(30);
        queue.insert(40);

        queue.displayQueue();

        queue.remove();
        queue.remove();

        queue.displayQueue();

    }
}