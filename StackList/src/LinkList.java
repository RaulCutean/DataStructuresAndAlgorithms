public class LinkList {

    private Link first;


    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int value) {

        Link newLink = new Link(value);
        newLink.next = first;
        first = newLink;
    }

    public int deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp.data;
    }

    public void displayList() {
        System.out.print(" (first --> last: )");
        System.out.println();
        Link curr = first;

        while(curr != null) {
            curr.displayLink();
            curr = curr.next;
        }
        System.out.println();

    }

}
