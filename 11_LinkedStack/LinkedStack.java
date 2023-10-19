public class LinkedStack<E> implements StackADT<E> {

    private LinearNode<E> top;
    private int count;

    public LinkedStack() {
        this.count = 0;
        this.top = null;
    }

    @Override
    public void push(E element) {
        LinearNode<E> temp = new LinearNode<E>(element);
        temp.setNext(this.top);
        this.top = temp;
        temp = null; // just to be explicit
        count++;
    }

    @Override
    public E pop() {
        E result = this.peek();
        this.top = this.top.getNext();
        count--;
        return result;
    }

    @Override
    public E peek() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("stack");
        }
        return this.top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return this.count;
    }

    public String toString() {
        String result = "";
        // TODO: implement the toString
        return result;
    }
    
}
