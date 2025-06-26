package LINKEDLIST;

public class Basic_syntax {

    class Node {
        char val;
        Node address;

        Node(char ch) {
            this.val = ch;
            this.address = null;
        }
    }

    public static void main(String[] args) {
        Basic_syntax obj = new Basic_syntax();
        Node head = obj.new Node('A');  
        System.out.println("Node created with value: " + head.val);
    }
}

