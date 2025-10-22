// STACK : is a special types of list in which the elements are stored in a particular order
// STACK : follows LIFO (Last In First Out) order
// push() : to add an element
// pop() : to remove an element
// peek() : to see the top element
// isEmpty() : to check if stack is empty

import java.util.Stack;

public class stack
{
    public static void main(String[] args) 
    {
        Stack <Integer> stack = new Stack<>(); 
        //push elements onto stack 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        //peek
        System.out.println("Top element is: " + stack.peek());
        
        //pop elements from stack
        stack.pop();
        System.out.println("stack:"+stack);

        //check if stack is empty   
        System.out.println("Stack is empty: " + stack.isEmpty());
    }

}