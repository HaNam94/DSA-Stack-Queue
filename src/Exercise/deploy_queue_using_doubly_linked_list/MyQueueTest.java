package Exercise.deploy_queue_using_doubly_linked_list;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(14);
        myQueue.enQueue(22);
        myQueue.enQueue(-3);
        myQueue.displayQueue();

        System.out.println("-------");
        myQueue.deQueue();
        myQueue.displayQueue();
    }
}
