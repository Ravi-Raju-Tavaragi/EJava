package Queue;

public class MainQueueArray
{
    public static void main(String[] args) 
    {
        QueueArray queue = new QueueArray(5);

        System.out.println("");
        System.out.println("-----Initially------");
        queue.display();

        System.out.println();
        System.out.println("Is Empty : "+queue.isEmpty());
        System.out.println();

        System.out.println("");
        System.out.println("------EnQueue------");
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        System.out.println();
        queue.display();

        System.out.println();
        System.out.println("First element in queue : "+queue.first());

        System.out.println();
        System.out.println("Last element in queue : "+queue.last());

        System.out.println();
        queue.deQueue();
        queue.display();

        System.out.println();
        System.out.println("First element in queue : "+queue.first());

        System.out.println();
        System.out.println("Last element in queue : "+queue.last());

        queue.display();
        queue.display();
        queue.display();
        queue.display();
        queue.display();
        queue.display();

        System.out.println();
        queue.display();

        System.out.println();
        System.out.println("First element in queue : "+queue.first());

        System.out.println();
        System.out.println("Last element in queue : "+queue.last());
        
    }
    
}
