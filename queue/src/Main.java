public class Main {
    public static void main(String[] args) {

        Queue arr = new Queue(7 );

        arr.enqueue(10);
        arr.enqueue(20);
        arr.enqueue(30);
        arr.enqueue(40);
        arr.enqueue(50);

        arr.dequeue();
        arr.dequeue();
        arr.dequeue();

        arr.enqueue(70);
        arr.enqueue(80);

        arr.display();
        System.out.println();
        while( !arr.isEmpty() ) {
            int n = arr.dequeue();
            System.out.print( n + " ");
        }
        System.out.println();



    }
}