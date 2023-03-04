public class BST {
    private Node root;
    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            add(root, node);
        }
    }

    private void add(Node current, Node node) {
        if (node.getKey().compareTo(current.getKey()) < 0) {
            //Meter a la izquierda
            if (current.getLeft() == null) {
                current.setLeft(node);
            } else {
                add(current.getLeft(), node);
            }
        } else if (node.getKey().compareTo(current.getKey()) > 0) {
            //Meter a la derecha
            if (current.getRight() == null) {
                current.setRight(node);
            } else {
                add(current.getRight(), node);
            }
        } else {
            //No hacer nada
        }
    }
    public void inOrderContrary() {inOrderContrary(root);
    }
    private void inOrderContrary(Node current) {
        if (current == null) {
            return;
        }
        inOrderContrary(current.getRight());
        System.out.println(current.getKey());
        inOrderContrary(current.getLeft());
    }
}
