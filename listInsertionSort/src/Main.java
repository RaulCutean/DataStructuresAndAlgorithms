public class Main {
    public static void main(String[] args) {
        int size = 10 ;

        Link[] links = new Link[size];

        for(int i = 0 ; i < size ; i++) {

            int n = (int)Math.floor( Math.random() * 99) + 1;
            Link newLink = new Link(n);
            links[i] = newLink;
        }
        System.out.print("Unsorted array: ");
        for(int i = 0 ; i < links.length ; i++) {
            links[i].displayLink();
        }

        SortedList list = new SortedList(links);
        System.out.println();
        list.displayList();
        for(int i = 0 ; i < size ; i++) {
            links[i] = list.remove();
        }
        System.out.println();
        System.out.print("Sorted array: ");
        for(int i = 0 ; i < size; i++) {
            links[i].displayLink();
        }


    }
}