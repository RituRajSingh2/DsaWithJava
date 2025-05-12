package com.Stack;
import java.util.Stack;
public class InBuiltExamples {
    public static void main(String[] args) {
//        create a Stack that is of type integer=create of
//        object of Stack for memory allocation
        Stack<Integer>stack=new Stack<>();
//        to insert the element in Stack
        stack.push(20);
        stack.push(40);
        stack.push(28);
        stack.push(35);
//        to remove or delete element from stack
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
