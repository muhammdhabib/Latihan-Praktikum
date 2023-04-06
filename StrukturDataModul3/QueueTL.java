public class QueueTL {

    private int head = 0;
    private int tail = 0;
    private String[] queue = new String[10];

    public void enqueue(String item) {
        if (tail == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        queue[tail++] = item;
    }

    public String dequeue() {
        if (head == tail) {
            System.out.println("Queue is empty");
            return null;
        }
        String item = queue[head];
        queue[head++] = null;
        return item;
    }

    public String peek() {
        if (head == tail) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue[head];
    }

    public static void main(String[] args) {
        QueueTL queue = new QueueTL();
        queue.enqueue("java");
        queue.enqueue("DotNet");
        queue.enqueue("PHP");
        queue.enqueue("HTML");
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("peek: " + queue.peek());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("peek: " + queue.peek());
    }
}