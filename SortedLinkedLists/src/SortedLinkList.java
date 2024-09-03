public class SortedLinkList {

    private Link first;



   public SortedLinkList() {
        first = null;
    }
    public boolean isEmpty(){
        return first == null;
    }


    public void insert(int key) {
        Link newLink = new Link(key);
        Link previous = null;
        Link curr = first;

        while (curr != null && key > curr.data) {
            previous = curr;
            curr = curr.next;
        }
        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = curr;
    }


    public Link remove() {
       Link temp = first;
       first = first.next;

       return temp;
    }
    public void displayList() {
        System.out.print(" List (first --> last): ");
       Link curr = first;

       while(curr != null){
           curr.displayLink();
           curr = curr.next;
       }
        System.out.println();

    }


}
