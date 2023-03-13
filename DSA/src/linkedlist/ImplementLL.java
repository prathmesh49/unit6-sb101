package linkedlist;

public class ImplementLL {
    public static void main(String[] args) {
        Node node = new Node(6);
        node.printNode();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public void printNode(){
        System.out.println(this.data +" -> "+this.next);
    }
}
