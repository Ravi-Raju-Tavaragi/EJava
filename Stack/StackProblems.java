package Stack;

public class StackProblems
{
    public static void main(String[] args) 
    {
        Stack mystack = new Stack(5);

        mystack.push(11);
        mystack.push(12);
        mystack.push(13);
        mystack.push(5);
        mystack.push(10);
        mystack.push(15);
        mystack.print();

        System.out.println();
        System.out.println(mystack.stackTop());

        System.out.println("peek position 1 - "+mystack.peek(1));
        System.out.println("peek position 2 - "+mystack.peek(2));

        System.out.println("---------------SET_2-----------------");
        Stack mystack2 = new Stack(10);
        for(int i = 1; i <= 10; i++)
        {
            mystack2.push(i);
        }
        mystack2.print();

        System.out.println();
        for(int i = 1; i <= 10; i++)
        {
            mystack2.pop();
        }
        mystack2.print();
        
    }
    
}
