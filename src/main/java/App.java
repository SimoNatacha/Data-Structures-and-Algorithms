import Lists.DoublyLinkedList;
import Lists.LinkedList;
import Structures.DoublyNode;
import Structures.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void linked(int n){
        List<Node> nodeList = new ArrayList<Node>();
        System.out.println("*** Initializing Nodes ****");
        for (int i = 0; i < n; i++) {
            int next=i+1;
            Node node = new Node(i*i);

            if (i==n-1){
                node.setNext(null);
                nodeList.add(node);
                break;

            }
            node.setNext(new Node(next*next));
            nodeList.add(node);
        }


        System.out.println("Creating LinkedList");
        LinkedList linkedList = new LinkedList(nodeList);

        System.out.println("Printing LinkedList...");
        linkedList.print();

    }
    public static void doublelinked(int n){
        List<DoublyNode> nodeList = new ArrayList<DoublyNode>();
        System.out.println("*** Initializing Nodes ****");
        for (int i = 0; i < n; i++) {
            int next=i+1;
            DoublyNode node = new DoublyNode(i*i);

            if(i==0){
                node.setPrev(null);
            }
           if(i>0){
               node.setPrev(nodeList.get(i-1));
           }
            if (i==n-1){
                node.setNext(null);
                nodeList.add(node);
                break;

            }
            node.setNext(new Node(next*next));
            nodeList.add(node);
        }


        System.out.println("Creating DoublyLinkedList");
        DoublyLinkedList linkedList = new DoublyLinkedList(nodeList);

        System.out.println("Printing DoublyLinkedList...");
        linkedList.print();

    }
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Data Structures and Algorithms in Java" );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        Integer size = sc.nextInt();
//            linked(size);
            doublelinked(size);

    }
}
