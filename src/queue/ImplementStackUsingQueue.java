package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();

    public void push(int x){
        int size = q1.size();
        q1.add(x);
        for(int i = 0; i<size;i++)
        {
            q1.add(q1.remove());
        }

    }

    public int pop(){
        if(!(q1.size()==0)){
            int pop = q1.remove();
            return pop;
        }else {
            System.out.println("Empty stack ");
            return 0;

        }
    }

    public int top(){
        if(!(q1.size()==0)){
            int top = q1.peek();
            return top;
        }else {
            System.out.println("Empty stack ");
            return 0;
        }
    }

    public static void main(String[] args){

        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println("top "+stack.top());

    }
}
