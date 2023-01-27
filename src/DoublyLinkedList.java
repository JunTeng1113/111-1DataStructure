class DoublyLinkedList {
    class Node {
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }

    Node head, tail = null;

    public void addNode(int item) {
        Node newNode = new Node(item);

        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
	
    public Node getNode(int index) {
		if (getLength() < index) {
			return null;
		}
		Node currentNode = head;
		int count = 0;
		while (count != index && currentNode.next != null) {
			count += 1;
			currentNode = currentNode.next;
		}
		return currentNode;
		
    }
	
    public void removeNode(int index) {
		Node currentNode = getNode(index);
		if (currentNode == null) {
			System.out.println("Index node is empty.");
		} else {
			Node prevNode = currentNode.previous;
			Node nextNode = currentNode.next;
			if (currentNode.next != null) {
				nextNode.previous = currentNode.previous;
			}
			if (currentNode.previous != null) {
				prevNode.next = currentNode.next;
			}
			System.out.println("Deleted Item: " + currentNode.item);
		}
    }
	
    public int getLength() {
		Node currentNode = head;
		int count = 0;
		if (currentNode == null) return 0;
		while (currentNode.next != null) {
			count += 1;
			currentNode = currentNode.next;
		}
		return count;
    }

    public void printNodes() {
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty.");
        } else {
			System.out.println("Nodes of doubly linked list: ");
			while(current != null) {  
				System.out.print(current.item + " ");  
				current = current.next;
			}  
			System.out.println("");
		}
    }  

    public static void main(String[] args) {  
        DoublyLinkedList dl_List = new DoublyLinkedList();  
		
        dl_List.removeNode(2); 
        dl_List.addNode(10);  
        dl_List.addNode(20);  
        dl_List.addNode(30);   
        dl_List.addNode(40);  
        dl_List.removeNode(2); 
        dl_List.addNode(50);  

        dl_List.printNodes();

        int length = dl_List.getLength();
		System.out.println("Length: " + length);
		
        Node a2 = dl_List.getNode(1);  
		System.out.println(a2.item);
    }  
}
