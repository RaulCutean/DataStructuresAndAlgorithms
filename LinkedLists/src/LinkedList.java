public class LinkedList <T> {

    private Link first ;

    public void LinkedList() {
        first = null ;
    }
    public boolean isEmpty(){
        return first == null;
    }

    public void addFirst(T id , T dd){
        Link newLink = new Link(id,dd);
        newLink.next = first;
        first = newLink;
    }
    public boolean hasCycle() {
        Link slow = first;
        Link fast = first;

        while(slow != null && fast != null && fast.next != null){
            slow = fast  ;
            fast = fast.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public Link deleteFirst() {
        if(isEmpty())
            return first;

        Link temp = first;
        first = first.next;
        return temp;
    }
    public void displayLink() {
        System.out.println("List (first -->last): ");
        Link curr = first;
        while(curr != null) {
            curr.displayLink();
            curr = curr.next;

        }
        System.out.println();
    }
    public Link find(T key) {
        Link curr = first;
        while(curr != null) {
            if(curr._iData == key)
            {
                return curr;
            }
            curr = curr.next;
        }

        return null;
    }

    public Link delete(T key) {
        Link curr = first;
        Link previous = first;
        while(curr._iData != key) {
            if(curr.next == null){
                return null;
            }
            else {
                previous = curr;
                curr = curr.next;
            }
        }
        if(curr == first){
            first = first.next;
        }
        else {
            previous.next = curr.next;
            curr.next = null;
        }


        return curr;
    }


}




















