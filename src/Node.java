public class Node {
    private String name;
    //Datos

    //Enlaces
    private Node right;
    private Node left;


    public Node(String key) {
        this.name = key;
    }

    public String getKey() {
        return name;
    }

    public void setKey(String key) {
        this.name = key;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
