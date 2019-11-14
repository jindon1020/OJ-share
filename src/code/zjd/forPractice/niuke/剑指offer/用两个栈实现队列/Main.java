package code.zjd.forPractice.niuke.剑指offer.用两个栈实现队列;

import java.util.Stack;

/**
 * @author zjd123
 * @date 2019/9/30 - 19:26
 */
public class Main {

     public Stack<Integer> stack1 = new Stack<Integer>();
     public Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }


    public int pop() {
        stack2.isEmpty();
        if(stack2.size() <= 0){ //慎用isEmpty()
            while (stack1.size() != 0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.push(1);
        m.push(2);
        m.push(3);
        m.push(4);
        m.push(5);
        for (int i = 0; i < 5; i++) {
            System.out.println(m.pop());
        }
    }

}
