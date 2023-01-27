

public class AVLTree {

    class Node {
        int data, height;
        Node left, right;
        Node(int d) {
            data = d;
            left = right = null;
            height = 1;
        }
    }

    public Node root;
    public AVLTree() { root = null; }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public Node rightRotate(Node node) {
        Node x = node.left;
        node.left = x.right;
        x.right = node;
        node.height = max(height(node.left), height(node.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }

    public Node leftRotate(Node node) {
        Node x = node.right;
        node.right = x.left;
        x.left = node;
        x.height = max(height(x.left), height(x.right)) + 1;
        node.height = max(height(node.left), height(node.right)) + 1;
        return x;
    }

    public int getBalance(Node N) {
        if (N == null) {
            return 0;
        }
        return height(N.left) - height(N.right);
    }
    
    public void insert(int data) {
        root = insertElement(root, data);
    }
    
    public Node insertElement(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }

        if (data < node.data) {
            node.left = insertElement(node.left, data);
        } else if (data > node.data) {
            node.right = insertElement(node.right, data);
        } else {
            return node;
        }

        node.height = 1 + max(height(node.left), height(node.right));
        int balance = getBalance(node);
        if (balance > 1 && data < node.left.data) {
            node = rightRotate(node);
        }

        if (balance < -1 && data > node.right.data) {
            node = leftRotate(node);
        }

        return node;
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

        AVLTree obj = new AVLTree();
        
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