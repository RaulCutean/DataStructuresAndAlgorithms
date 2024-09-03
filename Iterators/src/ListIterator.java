public class ListIterator {

    private Link curr;
    private Link prev;
    private LinkList ourList ;

    public ListIterator(LinkList list) {
        ourList = list;
        reset();
    }
    public void reset() {
        curr = ourList.getFirst();
        prev = null;
    }
    public boolean atEnd(){
        return curr.next == null;
    }
    public void nextLink() {
        prev = curr ;
        curr = curr.next ;
    }
    public Link getCurrent() {
        return curr;
    }
    public void insertAfter(int key) {
        Link newLink = new Link(key);

        if(ourList.isEmpty()){
            ourList.setFirst(newLink);
            curr = newLink;
        }
        else {
            newLink.next = curr.next;
            curr.next = newLink;
            nextLink();

        }
    }
    public void insertBefore(int key){
        Link newLink = new Link(key);

        if(prev == null){
            newLink.next = ourList.getFirst();
            ourList.setFirst(newLink);
            reset();
        }else {
            newLink.next = prev.next;
            prev.next = newLink;
            curr = newLink;
        }
    }
    public int deleteCurent() {
        int value = curr.data;
        if(prev == null){
            ourList.setFirst(curr.next);
            reset();
        }else{
            prev.next = curr.next;
            if(atEnd()){
                reset();
            }else{
                curr = curr.next;
            }

        }
        return value ;
    }


}
