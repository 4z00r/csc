class Node {
    kb line;
    Node left;
    Node right;

    public Node(kb line) {
        this.line = line;
        left = null;
        right = null;
    }

    public Node getLeft() {
        return left;
    }
    public Node getRight(){
        return right;
    }
    public String toString() {
        return this.line.toString();
    }

}