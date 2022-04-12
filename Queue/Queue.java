package Queue;

public class Queue {
    private Node first;
    private Node last;
    private int size;
    
    Queue(){
        this.first = null;
        this.last = null;
        size = 0;
    }
    
    void enqueue(int value){
        Node temp = new Node(value);
        if(this.size == 0){
            this.first = temp;
            this.last = temp;
            this.size++;
        }
        else{
            this.last.next = temp;
            this.last = temp;
            this.size++;
        }
    }
    int dequeue(){
      int value = 0;
      if(this.size == 0){
          System.out.println("No item in the queue");
          return this.size;
      }
      else if(this.size == 1){
          value = first.value;
          this.first = null;
          this.last = null;
          this.size--;
      }
      else{
          value = first.value;
          first = first.next;
          this.size--;
      }
        System.out.println("After dequeue size : "+this.size);
      return value;
    }
    void printQueue(){
        if(this.size > 0){
            Node cur = first;
            System.out.println("Itmes: ");
            while(cur != null){
                System.out.println(cur.value);
                cur = cur.next;
            }
        }
        else{
            System.out.println("No item in the queue");
        }
    }
}
