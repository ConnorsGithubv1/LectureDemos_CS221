import java.util.Arrays;
import java.util.NoSuchElementException;

public class CircularArrayQueue<E> implements QueueADT<E>{

    private final static int DEFAULT_CAPACITY = 150;
    private E[] queue;
    private int front, rear, count;

    public CircularArrayQueue(){
        this(DEFAULT_CAPACITY);
    }

    public CircularArrayQueue(int initialCapacity) {
        front = rear = count = 0;
        this.queue = (E[])new Object[initialCapacity];
    }

    @Override
    public void enqueue(E element) {
        if (size() == queue.length) {
            expandCapacity();
        }
        queue[rear] = element;
        rear = (rear + 1) % queue.length;
    }

    @Override
    public E dequeue() {
        if (this.isEmpty()){
            throw new EmptyCollectionException("queue");
        }
        E result = queue[front];
        queue[front] = null;

        front = (front + 1 )% queue.length;
        count--;

        return result;
    }

    @Override
    public E first() {
        if (isEmpty()) {
        throw new NoSuchElementException("Queue is empty");
        }
        return queue[front]; // Assuming 'queue' is the instance variable representing your queue.
    }
    

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return count;
    }
    
    public String toString(){
        String result = "[";
        int index = this.front;

        for(int i = 0; i < size(); i++){
            if(i > 0) {
                result += ", ";
            }

            result += queue[index];
            index = (index + 1) % queue.length;
        }

        result += " ]";
        return result;
    }

    private void expandCapacity() {
        E[] larger = Arrays.copyOf(queue, queue.length *2);
        queue = larger;
    }
    
}
