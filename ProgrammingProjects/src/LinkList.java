public class LinkList {

    private Link first ;
    private Link last;


    public LinkList(){
        first = null;
        last = null;
    }
    public boolean isEmpty(){
        return first == null;
    }


    public void LinkList(Link[] links){
        first = null;
        last = null;
        for(int i = 0 ; i < links.length ; i++){
            insert(links[i]);
        }

    }
    public void insert(Link link){
        Link curr = first ;
        Link prev = null;

        while(curr != null && link.data > curr.data){
            prev = curr;
            curr = curr.next;
        }
        if(prev == null){
            first = link;
        }else {
            prev.next = link;
        }
        link.next = curr;

    }





    public void displayList(){

        Link current = first;
        System.out.print("List (first --> last): ");
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }


}
