package stack;

import java.util.Stack;


public class StackUsingArray {

    int top;
    static final int MAX = 1000;
    int a[] = new int[MAX];

    boolean isEmpty(){
        return (top < 0);
    }
    StackUsingArray(){
        top = -1;
    }

     boolean push(int n){
        if(top >= MAX-1)
        {
            System.out.println("Stack is full");
            return false;
        }
        else {
            a[++top] = n;
            System.out.println(n+ " is pushed in the stack");
            return true;
        }
    }

     int pop(){
        if(top < 0)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            int n = a[top--];
            System.out.println(n + " is popped from stack");
            return n;

        }
    }

     int peek(){
        if(top < 0)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            int n = a[top];
            System.out.println(n+ " is at the top");
            return n;
        }
    }

    void print(){

        for(int i = top;i>-1;i--){
            System.out.print(" "+ a[i]);
        }
    }

    public static void main(String ars[])
    {
        StackUsingArray stack = new StackUsingArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()+" popped from stack");
        System.out.println("Top elemnet in stack is "+ stack.peek());
        System.out.println("Elements in stack are: ");
        stack.print();

    }
}
