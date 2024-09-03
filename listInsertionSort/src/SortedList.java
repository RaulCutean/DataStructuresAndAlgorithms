public class SortedList {

    private Link first;



    public SortedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }
    public SortedList(Link[] linkArr){

        first = null ;
        for(int i = 0 ; i < linkArr.length ; i++){
            insert(linkArr[i]);
        }

    }

    public void insert(Link k){

        Link prev = null;
        Link curr = first;

        while(curr != null && k.data > curr.data){
            prev = curr;
            curr = curr.next;
        }
        if(prev == null){
            first = k;
        }else {
            prev.next = k;
        }
        k.next = curr;
    }
        public Link remove() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("Ordered List (first --> last): ");
        Link curr = first;
        while(curr != null){
            curr.displayLink();
            curr = curr.next;
        }
        System.out.println();
    }
}





























