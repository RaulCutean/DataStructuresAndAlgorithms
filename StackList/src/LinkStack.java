public class LinkStack {

    private LinkList list;


    public LinkStack() {
        list = new LinkList();
    }

    public void push(int data) {
        list.insertFirst(data);
    }

    public int pop() {
       return list.deleteFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void displayStack() {
        System.out.println("Stack (top --> bottom)");
        list.displayList();
    }

}
