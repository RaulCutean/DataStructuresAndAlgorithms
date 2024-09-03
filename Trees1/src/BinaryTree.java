import java.util.Stack;

public class BinaryTree {

    public Node root ;

    public void createTree(){
        Node first = new Node(9);
        Node  second = new Node(2);
        Node   third = new Node(3);
        Node  fourth = new Node(4);
        Node  fifth = new Node(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;

    }
    public void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void preOrderIterative(Node root ) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
        public void inOrderTraversal(Node root){
            if(root == null) {
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
        public void inOrderTraversalIterative(Node root) {
            if (root == null) {
                return;
            }
            Stack<Node> stack = new Stack<>();
            Node temp = root ;
            while(!stack.isEmpty() || temp != null) {
                if(temp != null) {
                    stack.push(temp);
                    temp = temp.left;
                }else {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    temp = temp.right;
                }
            }
        }
        public void postOrder(Node root) {
            if(root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");


        }





}