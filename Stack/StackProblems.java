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
        mystack2.display();
        mystack2.print();

        System.out.println();
       
        System.out.println("peek position 1 - "+mystack2.peek(1));
        System.out.println("peek position 2 - "+mystack2.peek(2));
        System.out.println("peek position 3 - "+mystack2.peek(3));
        System.out.println("peek position 4 - "+mystack2.peek(4));
        System.out.println("peek position 5 - "+mystack2.peek(5));
        System.out.println("peek position 6 - "+mystack2.peek(6));
        System.out.println("peek position 7 - "+mystack2.peek(7));
        System.out.println("peek position 8 - "+mystack2.peek(8));
        System.out.println("peek position 9 - "+mystack2.peek(9));
        System.out.println("peek position 10 - "+mystack2.peek(10));

        for(int i = 1; i <= 10; i++)
        {
            mystack2.pop();
        }
        mystack2.print();

        System.out.println();
        System.out.println("Reverse array");

        int nums[] = {10, 20, 30, 40, 50};
        for(int i = 0; i < nums.length; i++)
        {
            mystack2.push(nums[i]);
        }
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = mystack2.pop();
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        System.out.println("Reverse array");

        int nums1[] = {'R', 'A', 'V', 'I'};
        for(int i = 0; i < nums1.length; i++)
        {
            mystack2.push(nums1[i]);
        }
        for(int i = 0; i < nums1.length; i++)
        {
            nums1[i] = mystack2.pop();
            System.out.print(nums1[i] + " ");
        }
        
    }
    
}
