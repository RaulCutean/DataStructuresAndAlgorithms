public class LinkList {

    private Link first;
    private Link last;


    public LinkList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }
    public void insertLast(int data) {
        Link newLink = new Link(data);

        if( isEmpty() ){
            first = newLink;
        }else
            last.next = newLink;
        last = newLink;
    }
    public int deleteFirst(){

        int temp = first.data;
        if(first.next == null){
            last = null;
        }
        first = first.next;

        return temp;
    }
    public void displayList(){

        Link curr = first;
        while(curr != null){
            curr.displayLink();
            curr = curr.next;
        }
        System.out.println();
    }

}
