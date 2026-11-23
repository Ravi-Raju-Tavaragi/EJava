package Stack;

public class StcakMain
{
    public static void main(String[] args) 
    {
        Stack stack = new Stack(5);

        System.out.println("Is empty : "+stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);


        stack.display();

        System.out.println();

        System.out.println("Top Element : " + stack.stackTop());
        System.out.println();

        System.out.println("Element at position 1 "+stack.peek(1));
        System.out.println("Element at position 2 "+stack.peek(2));
        System.out.println("Element at position 3 "+stack.peek(3));

        System.out.println("Deleted"+stack.pop());
        System.out.println("Deleted"+stack.pop());
        System.out.println();

        
    }
    
}
