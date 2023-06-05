package stack;

public class StackUsingLinkedList {

    Node root;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    boolean isEmpty(){
        if(root == null)
            return true;
        else return false;
    }

    public void push(int data){
        Node new_node = new Node(data);
        if(root == null){
            root = new_node;
        }
        else {
            Node temp = root;
            root = new_node;
            new_node.next = temp;
        }
    }

    public int pop(){
        int popped = Integer.MIN_VALUE;
        if(root == null)
        {
            System.out.println("LinkedList is empty ");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek(){
        if(root == null)
        {
            System.out.println("LinkedList is empty ");
            return 0;
        }
        else {
            int data = root.data;
            return data;
        }
    }

    public static void main(String ars[])
    {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()
                + " popped from stack");

        System.out.println("Top element is " + stack.peek());

    }
}
