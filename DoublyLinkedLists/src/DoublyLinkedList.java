public class DoublyLinkedList {

    private Link first ;
    private Link last ;


    public DoublyLinkedList(){
        first = null;
        last = null;
    }


    public boolean isEmpty(){
        return first == null ;
    }

    public void insertFirst(int value) {
        Link newLink = new Link(value);
        if(isEmpty()){
            last = newLink;
        }else {
            first.prev = newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    public void insertLast(int value){
        Link newLink = new Link(value);
        if(isEmpty()){
            last = newLink;
        }else {
            last.next = newLink;
            newLink.prev = last;
        }
        last = newLink;
    }

    public Link deleteFirst() {
        if(isEmpty()){
            return null;
        }
        Link temp = first;

        if(first.next == null){
            last = null;
        }else {
            first.next.prev = null;
        }
        first = first.next;

        return temp;
    }

    public Link deleteLast() {
        if(isEmpty()){
            return null;
        }
        Link temp = last;

        if(first.next == null){
            first = null;
        }else {
            last.prev.next = null;
        }
        last = last.prev;
        return temp;
    }

    public boolean insertAfter(int key , int data){
        Link curr = first;

        while(curr.data != key){

            curr = curr.next;
            if(curr == null) {
                return false;
            }
        }
        Link newLink = new Link(data);

        if(curr == last){
            newLink.next = null;
            last = newLink;
        }else {
            newLink.next = curr.next;
        }
        newLink.prev = curr;
        curr.next = newLink;

        return true;
    }
    public Link deleteKey(int key) {
        if(isEmpty()){
            return null;
        }
        Link curr = first;
        while (curr.data != key) {
            curr = curr.next;

            if(curr == null) {
                return null;
            }
        }
        if(curr == first){
            first = curr.next;
        }else {
            curr.prev.next = curr.next;
        }
        if(curr == last) {
            last = curr.prev;
        }else {
            curr.next.prev = curr.prev;
        }
        return curr;
    }
    public void displayForward() {
        Link curr = first;
        System.out.print("List (last --> first): ");
        while(curr != null) {
            curr.displayLink();
            curr = curr.next;
        }
        System.out.println();
    }
    public void displayBackwards() {
        Link curr = last;
        System.out.print("List (last --> first): ");
        while(curr != null) {
            curr.displayLink();
            curr = curr.prev;
        }
        System.out.println();
    }


    }

















