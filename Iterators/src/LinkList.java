public class LinkList {

    private Link first;



    public LinkList() {
        first = null;
    }
    public boolean isEmpty() {
        return first == null ;
    }
    public Link getFirst() {
        return first;
    }
    public void setFirst(Link link){
        first = link;
    }
    public ListIterator listIterator() {
        return new ListIterator(this);
    }
    public void displayList() {
        Link curr = first;

        while(curr != null){
            curr.displayLink();
            curr = curr.next;
        }
        System.out.println();
    }


}
