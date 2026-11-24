package StackUsingLinkedList;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class Stack 
{
    Node top;
    
    Stack()
    {
        top = null; // No Node is created
    }

    //push()
    public void push(int value)
    {
        Node newNode = new Node(value);

        newNode.next = top; // holding head adress

        top = newNode; // head is now pointing to new node 40-->30-->20-->10

        System.out.println(value+" pushed");
    } 

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = top.data;

        top = top.next;

        return value; // temply stored in value variable which was deleted permnetly but copy of data in value
    }

    //peek(top element)
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    //peek at position position start from 1 (top == posn1)
    public int peekPosition(int position)
    {
        if(position <= 0)
        {
            System.out.println("Invalid position");
            return -1;
        }

        Node temp = top;
        int count = 1;

        while(temp != null && count < position)
        {
            temp = temp.next;
            count++;
        }

        if(temp == null)
        {
            System.out.println("position does not exist");
            return -1;
        }

        return temp.data;
    }

    //isEmpty()
    public boolean isEmpty()
    {
        return top == null;
    }

    //display()
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return ;
        }

        System.out.print("Top --> ");

        Node temp = top;

        while(temp != null)
        {
            System.out.print(temp.data);
            System.out.print(" --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

}
