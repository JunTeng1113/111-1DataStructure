

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

public class RBTree {

    Node root;
    public void insert(int data) {
        root = insertElement(root, data);
    }

    public Node insertElement(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertElement(root.left, data);
        } else if (data > root.data) {
            root.right = insertElement(root.right, data);
        }

        if (isRed(root.right) && !isRed(root.left)) {
            root = rotateLeft(root);
        }
        
        if (isRed(root.left) && isRed(root.left.left)) {
            root = rotateRight(root);
        }

        if (isRed(root.left) && isRed(root.right)) {
            flipColors(root);
        }

        return root;
    }

    public boolean isRed(Node node) {
        if (node == null) {
            return false;
        }
        return (node.color == 1);
    }

    public Node rotateLeft(Node node) {
        Node x = node.right;
        node.right = x.left;
        x.left = node;
        x.color = node.color;
        node.color = 1;
        return x;
    }

    public Node rotateRight(Node node) {
        Node x = node.left;
        node.left = x.right;
        x.right = node;
        x.color = node.color;
        node.color = 1;
        return x;
    }

    public void flipColors(Node node) {
        node.color = 1;
        node.left.color = 0;
        node.right.color = 0;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print("[" + node.data + "] "); 
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if ( node != null ) {
            System.out.print("[" + node.data + "] "); 
            preOrder(node.left);         
            preOrder(node.right);
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
        RBTree rbtree = new RBTree();
        rbtree.insert(3);
        rbtree.insert(9);
        rbtree.insert(55);
        rbtree.insert(24);
        rbtree.insert(31);
        rbtree.insert(28);
        rbtree.insert(53);
        rbtree.inOrder(rbtree.root);
        System.out.println(); 
        rbtree.preOrder(rbtree.root);
        System.out.println(); 
        rbtree.postOrder(rbtree.root);
        System.out.println(); 
    }
}