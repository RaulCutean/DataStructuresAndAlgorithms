public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(22 , 2.99);
        list.addFirst(44 , 4.99);
        list.addFirst(66 , 6.99);
        list.addFirst(88 , 8.99);

        list.displayLink();

        while(!list.isEmpty()){
            Link aLink = list.deleteFirst();
            System.out.println("Deleted ");
            aLink.displayLink();
            System.out.println();
        }
        list.displayLink();

        System.out.println("=========================");

        LinkedList list2 = new LinkedList();

        list2.addFirst(22 , 2.99);
        list2.addFirst(44 , 4.99);
        list2.addFirst(66 , 6.99);
        list2.addFirst(88 , 8.99);

        list2.displayLink();

        Link f = list2.find(22);
        if(f != null){
            f.displayLink();
        }else{
            System.out.println("Link not found");
        }
        Link d = list2.delete(66);
        if(d != null){
            System.out.println("Deleted link with key " + d._iData);
        }
        else{
            System.out.println("Can't delete link");
        }
        list2.displayLink();

    }
}