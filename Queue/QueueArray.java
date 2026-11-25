package Queue;

public class QueueArray
{
    int size;
    int front;
    int rear;
    int[] queue;
    
    QueueArray(int size)
    {
        this.size = size;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    public void enQueue(int value)
    {
        if(isFull())
        {
            System.out.println("queue is full");
            return ;
        }

        rear++;
        queue[rear] = value;

        System.out.println(value +" value Inserted");
    }

    //deque
    public int deQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }

        front++;
        return queue[front];
    }

    //isEmpty()
    public boolean isEmpty()
    {
        return front == rear;
    }

    public boolean isFull()
    {
        return rear == size - 1;
    }

    //first()
    public int first()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front + 1];
    }

    //last()
    public int last()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[rear];
    }

    //display()
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front");
        for(int i = front + 1; i <= rear; i++)
        {
            System.out.println(queue[i]);
            System.out.println("-------------");
        }
        System.out.println("----------------");
    }
    
}
