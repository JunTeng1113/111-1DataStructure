

class Node {
    int data;
    Node left, right;
    int color;
    Node(int d) {
        data = d;
        left = right = null;
        color = 1;
    }
}

public class BSTree {

    public Node root;
    public BSTree() { root = null; }

    public void insert(int data) {
        if ( root == null ) {
            root = new Node(data);
            return;
        }
        
        Node current = root;
        while (true) {
            if ( data < current.data ) {
                if ( current.left == null ) {
                    current.left = new Node(data);
                    return;
                } else {
                    current = current.left;
                }
            }
            else {
                if ( current.right == null ) {
                    current.right = new Node(data);
                    return;
                } else {
                    current = current.right;
                }
            }
        }
    }
    
    public void preOrder(Node node) {
        if ( node != null ) {
            System.out.print("[" + node.data + "] "); 
            preOrder(node.left);         
            preOrder(node.right);
        }
    }
    
    public void inOrder(Node node) {
        if ( node != null ) {
            inOrder(node.left);
            System.out.print("[" + node.data + "] "); 
            inOrder(node.right);
        }
    }
    
    public void postOrder(Node node) {
        if ( node != null ) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print("[" + node.data + "] "); 
        }
    }
	
    public static void main(String[] args) {
            int i;            
            int[] array = { 3, 9, 55, 24, 31, 28, 53 };
            
            BSTree obj = new BSTree();
        
            System.out.print("Original Array:");
            for ( i = 0; i < array.length; i++ ) {
                    System.out.print("[" + array[i] + "] ");
                    obj.insert(array[i]);
            }
            System.out.println();

            System.out.print("InOrder:");
            obj.inOrder(obj.root);
            System.out.println();

            System.out.print("PreOrder:");
            obj.preOrder(obj.root);
            System.out.println();

            System.out.print("PostOrder:");
            obj.postOrder(obj.root);
            System.out.println();
    }
}