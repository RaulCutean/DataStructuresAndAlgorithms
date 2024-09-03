public class BinaryTree {

    public Node root ;

    public void createTree(){
        Node first = new Node(9);
        Node  second = new Node(2);
        Node   third = new Node(3);
        Node  fourth = new Node(4);

        root = first;
        first.left = second;
        second.right = third;
        third.left = fourth;

    }
    public void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


}