public class TestBST {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTree.setTree("GenericsKB.txt", tree);
         tree.find(tree, "insurance broker");
         tree.findConfidence(tree, "insurance broker", "An insurance broker is a broker");
         //Node node = tree.find("insurance broker");
         //System .out.println(node.line.getSentence()+ "\t" + node.line.getConfidencelvl());


    }
}