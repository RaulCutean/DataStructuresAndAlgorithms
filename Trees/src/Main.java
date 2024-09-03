public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.createTree();
        tree.preOrder(tree.root);
    }
}