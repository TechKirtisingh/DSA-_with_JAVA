import java.util.Stack;

class stackNode
{
    int data;
    stackNode next;
    stackNode(int data)
    {
        this.data = data;
        next = null;
    }
    
}
class MyStack
{
    stackNode top;

    void push(int data)
    {
        stackNode newNode = new stackNode(data);
        newNode.next = top;
        top = newNode;
    }
    int pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int value= top.data;
        top=top.next;
        return value;
    }
    int peek()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty()
    {
        return top==null;
    }
}

public class stack2 {
    public static void main(String[] args) {
        MyStack st= new MyStack();
        st.push(24);
        st.push(25);
        System.out.println("Top element is: " + st.peek());
        st.pop();
        System.out.println("Top element after pop opertation : " + st.peek()); 
        System.out.println("Stack is empty: " + st.isEmpty());
        

    }
    
}
