public class Main {
    public static void main(String[] args) {

        SortedLinkList list = new SortedLinkList();

        list.insert(50);
        list.insert(30);

        list.insert(20);
        list.insert(10);

        list.displayList();

        list.remove();
        list.displayList();

    }
}