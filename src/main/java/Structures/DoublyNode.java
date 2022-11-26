package Structures;

public class DoublyNode extends Node{
    private Node prev;

    public DoublyNode(int value) {
        super(value);
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }


}
