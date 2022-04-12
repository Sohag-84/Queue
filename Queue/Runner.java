package Queue;

public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(12);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(4);
        q.dequeue();
        q.printQueue();
    }
}
