package Stack;

public class Stack
{
    int size;
    int top;
    int[] stack;

    // Constructor
    Stack(int size)
    {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    // isEmpty()
    boolean isEmpty()
    {
        return top == -1;
    }

    // isFull()
    boolean isFull()
    {
        return top == size - 1;
    }

    // push()
    void push(int value)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = value;

        System.out.println(value + " inserted into stack");
    }

    // pop()
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }

        int value = stack[top];
        top--;

        return value;
    }

    // stackTop()
    int stackTop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }

        return stack[top];
    }

    // peek() / peep()
    int peek(int position)
    {
        if(position <= 0)
        {
            System.out.println("Invalid Position");
            return -1;
        }

        int index = top - position + 1;

        if(index < 0 || index > top)
        {
            System.out.println("Invalid Position");
            return -1;
        }

        return stack[index];
    }

    // display()
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("\nStack Elements (Top to Bottom)");

        for(int i = top; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }

    public void print()
    {
        if (this.top == -1)
        {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = this.top; i >=0; i--)
        {
            System.out.println(" [ " + i + " ]  --> " + stack[i]);
        }
    }
}