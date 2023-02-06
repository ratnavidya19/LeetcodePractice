package queue;

public class QueueUsingArray {

    int front, rear, size, capacity;
    int arr[];

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = size-1;
        arr = new int[this.capacity];
    }

    public boolean isFull(){
        return (size == capacity);
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void enqueue(int item){

        if(this.isFull())
        {
            return;
        }
        else{
            rear = (rear + 1) % capacity;
            arr[rear] = item;
            size = size + 1;
            System.out.println(item+" is inserted in queue");
        }
    }

    public void dequeue(){
        if(isEmpty()){
        }
        else {
            int item = arr[front];
            front = (front + 1) % capacity;
            size = size - 1;
            System.out.println(item+" is removed from queue");
        }
    }

    public int front(){
        return arr[front];
    }

    public int rear(){
        return arr[rear];
    }

    public static void main(String[] args)
    {
        QueueUsingArray queue = new QueueUsingArray(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
         queue.dequeue();
        System.out.println("front element in queue "+queue.front());
        System.out.println("rear element in queue "+queue.rear());


    }
}
