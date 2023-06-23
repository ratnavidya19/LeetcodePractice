package stack.Medium;

import java.util.Stack;

//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//Youtube - https://www.youtube.com/watch?v=WxCuL3jleUA
//Time complexity - O(1) for each function
public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min_val;
    public MinStack() {
        stack = new Stack<>();
        min_val = new Stack<>();

    }

    public void push(int val) {
        if(min_val.isEmpty() || val <= min_val.peek()){
            min_val.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if(stack.peek().equals(min_val.peek())){
            min_val.pop();
        }
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_val.peek();
    }
}
