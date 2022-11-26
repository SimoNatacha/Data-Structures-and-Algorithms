package Lists;

import Structures.DoublyNode;
import Structures.Node;

import java.util.List;

public class DoublyLinkedList {


    private  List<DoublyNode> nodes;

    public DoublyLinkedList(List<DoublyNode> nodes) {
this.nodes=nodes;
    }

    public void print(){
        for (DoublyNode nodeItem: nodes
        ) {
            if (nodeItem.getPrev()== null){
                System.out.print("null <-- "+nodeItem.getValue()
                );
            }
            if(nodeItem.getNext() == null){
                System.out.print("--> null");
                return;
            }
            System.out.print( " <--> ");
            System.out.print( nodeItem.getNext().getValue());
        }
    }
}
