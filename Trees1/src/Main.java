public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.createTree();
        tree.preOrder(tree.root);
        System.out.println();
        tree.preOrderIterative(tree.root);
        System.out.println();
        tree.inOrderTraversal(tree.root);
        System.out.println();
        tree.inOrderTraversalIterative(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }
}