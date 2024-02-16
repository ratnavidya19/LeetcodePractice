package stack.Medium;

import java.util.Stack;

//Design a max stack data structure that supports the stack operations and supports finding the stack's maximum element.
//Youttube-  https://www.youtube.com/watch?v=PTslLU7n66o
public class MaxStack {

    int max;
    Stack<Integer> stack;
    Stack<Integer> stack2;

    public MaxStack() {
        max = Integer.MIN_VALUE;
        stack = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void push(int x) {
        // Only push the old maximum value when the current
        // maximum value changes after pushing the new value x.
        // "==" is included here so pop() implementation would be easier.
        if (x >= max) {
            stack.push(max);
            max = x;
        }
        stack.push(x);
    }

    public int pop() {
        // if pop operation could result in the changing of the current maximum value,
        // pop twice and change the current maximum value to the last maximum value.
        int ret = stack.pop();
        if (ret == max) {
            max = stack.pop();
        }
        return ret;
    }

    public int top() {
        return stack.peek();

    }

    public int peekMax() {
        return max;

    }

    public int popMax() {
        int ret = max;
        int tmp = pop();
        // use stack2 to temporarily store the numbers before max appears.
        while (tmp != ret) {
            stack2.push(tmp);
            tmp = pop();
        }
        while (!stack2.isEmpty())
            push(stack2.pop());
        return ret;
    }
}
