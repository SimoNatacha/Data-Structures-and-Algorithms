package Lists;

import Structures.DoublyNode;
import Structures.Node;

import java.util.List;

public class LinkedList {
    public List<Node> nodes;

    public LinkedList(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void print(){
        for (Node nodeItem: nodes
             ) {
            if (nodeItem== nodes.get(0)){
                System.out.print(nodeItem.getValue()
            );
            }
            System.out.print( " --> ");
            if(nodeItem.getNext() == null){
                System.out.print("null");
                return;
            }
            System.out.print( nodeItem.getNext().getValue());
        }
    }
}
