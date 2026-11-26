package Queue;

public class ProblemsOnQueue
{
    public static void main(String[] args) 
    {
        QueueArray myQueue = new QueueArray(5);

        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);
        myQueue.enQueue(40);
        myQueue.enQueue(50);
        myQueue.display();

        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            sum = sum + myQueue.deQueue();
        }

        System.out.println(sum);
        myQueue.display();
        
        
    }
    
}
