import java.io.File;
import java.util.Scanner;

public class BinaryTree{
    Node root;

    public BinaryTree(){
        root = null;
    }
    public void visit(Node node){
        System.out.println(node.line);
    }

    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if (node != null){
            visit(node);
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }
    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node node){
        if (node != null){
            preOrder(node.getLeft());
            preOrder(node.getRight());
            visit(node);
            
            
        }
    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if (node != null){
            inOrder(node.getLeft());
            visit(node);
            inOrder(node.getRight());
        }
    }
    public Node find(String d){
        if (root==null){
            return null;
        }
        else
            return find(d,root);
    }
    public Node find(String d, Node node){
        int bool = (d).compareTo(node.line.getTerm());
        if (bool==0){
            return node;
        }
        else if (bool <0) {
            return (node.left== null) ? null: find(d, node.left);
        }
        else {
            return (node.right == null) ? null: find(d, node.right);
        }
    }
    public Node findConfidence(String d, String sentence){
        if (root==null){
            return null;
        }
        else
            return findConfidence(d,sentence, root);
    }
    public Node findConfidence(String d, String sentence, Node node) {
        int bool1 = (d).compareTo(node.line.getTerm());
        int bool2 = sentence.compareTo(node.line.getSentence());
        if (bool1==0 && bool2==0){
            return node;
        }
        else if (bool1 <0 && bool2 <0) {
            return (node.left== null) ? null: find(d, node.left);
        }
        else {
            return (node.right == null) ? null: find(d, node.right);
        }
    }

    public void insert(kb d) {
        if (root==null) {
            root = new Node(d);
        }
        else {
            insert(d,root);
        }
    }
    public void insert(kb d, Node node){
        if (d.getTerm().compareTo(node.line.getTerm())<=0){
            if (node.left == null){
                node.left = new Node(d);
            }
            else {
                insert(d, node.left);
            }
        }
        else {
            if (node.right == null){
                node.right= new Node(d);
            }
            else {
                insert(d, node.right);
            }
        }
    }
    public void delete(String d){
        root = delete(d, root);
    }
    public Node delete(String d, Node node){
        if (node==null)
            return null;
        int bool = d.compareTo(node.line.getTerm());
        if (bool<0){
            node.left = delete(d,node.left);
        }
        else if (bool>0){
            node.right = delete(d, node.right);
        }
        else if (node.left != null && node.right != null) {
            node.line = findMin(node.right).line;
            node.right = removeMin(node.right);
        }
        else {
            if (node.left != null){
                node = node.left; 
            }
            else {
                node = node.right; 
            }
            return node;
        }
    }
    public Node findMin(Node node) {
        if (node != null) {
            while (node.left != null) {
                node = node.left; 
            }
        }
        return node; 
    }
    public Node removeMin(Node node) { 
        if (node == null){
            return null;
        }
        else if (node.left != null) {
            node.left = removeMin(node.left);
            return node;
        }
        else {
            return node.right;
        }

    }

    public void find(BinaryTree tree, String term){
        Node node = tree.find(term);
        System.out.println(("Statement found: " + node.line.getSentence()+ ". (Confidence score: " + node.line.getConfidencelvl() +")"));
    }
    public void findConfidence(BinaryTree tree, String term, String sentence) {
        Node node = tree.findConfidence(term, sentence);
        System.out.println("The statement was found and has a confidence score of " + node.line.getConfidencelvl() + ".");
    }

    public static void setTree(String file, BinaryTree tree) {
        try {
            Scanner scanner = new Scanner(new File(file));
            while (scanner.hasNextLine()) {
                String[] line = new String[3];
                String lineRead = scanner.nextLine(); 
                line= lineRead.split("\t");                
                kb object = new kb(line[0], line[1], line[2]);
                //Node node = new Node(object);
                tree.insert(object);
            }
            scanner.close();
        }
        catch (Exception e){ 
            System.out.println("Error! File not found");             // if file not found - prints error
         }
    }
}