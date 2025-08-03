public class SinglyLinkedList {
    
   
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; 

   
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
       list.add(10);
       list.add(50);
       list.add(40);
       list.add(70);
       
      list.printList();
    }
}
