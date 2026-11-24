package StackUsingLinkedList;

public class MainStackLL 
{
    public static void main(String[] args) 
    {
        Stack stackLL = new Stack();
        
        System.out.println("Initially");

        stackLL.display();

        System.out.println();
        System.out.println("Is Empty : " + stackLL.isEmpty());

        System.out.println();
        System.out.println("Push");
        stackLL.push(10);
        stackLL.push(20);
        stackLL.push(30);
        stackLL.push(40);
        stackLL.push(50);
        stackLL.display();

        System.out.println();
        System.out.println("peek top element");
        System.out.println("Top Element : "+stackLL.peek());

        System.out.println();
        System.out.println("Peek by Position");
        System.out.println("Position 1 - "+stackLL.peekPosition(1));
        System.out.println("Position 2 - "+stackLL.peekPosition(2));
        System.out.println("Position 3 - "+stackLL.peekPosition(3));
        System.out.println("Position 4 - "+stackLL.peekPosition(4));
        System.out.println("Position 5 - "+stackLL.peekPosition(5));
        System.out.println("Position 6 - "+stackLL.peekPosition(6));
        
        System.out.println();
        System.out.println("pop");
        System.out.println("Poped Element - "+stackLL.pop());
        stackLL.display();

        System.out.println();
        System.out.println("top after pop");
        System.out.println("Top Element : "+stackLL.peek());

        System.out.println();
        System.out.println("pop Remaining Elements");
        System.out.println("Poped Element - "+stackLL.pop());
        stackLL.display();
        System.out.println("Poped Element - "+stackLL.pop());
        stackLL.display();
        System.out.println("Poped Element - "+stackLL.pop());
        stackLL.display();
        System.out.println("Poped Element - "+stackLL.pop());
        stackLL.display();
        System.out.println("Poped Element - "+stackLL.pop());
        stackLL.display();
    }
    
}
