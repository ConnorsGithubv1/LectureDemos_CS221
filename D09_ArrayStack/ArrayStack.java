import java.util.Arrays;

public class ArrayStack<E> implements StackADT<E> {
    private final static int DEFAULT_CAPACITY = 100;

    private E[] stack;
    private int top;

    
    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
        this.top = 0;
        this.stack = (E[])(new Object[initialCapacity]);
    }

    @Override
    public void push(E element) {
        if (this.size() == this.stack.length) {
            // expand the capacity
            expandCapacity();
        }
        this.stack[this.top] = element;
        this.top++;
    }

    @Override
    public E pop() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("stack");
        }
        this.top--;
        E result  = this.stack[this.top];
        this.stack[this.top] = null;
        return result;
    }

    @Override
    public E peek() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("stack");
        }
        E result  = this.stack[this.top];
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return this.top;
    }

    // @SuppressWarnings("unchecked")
    private void expandCapacity() {
        // E[] temp = (E[])(new Object[this.stack.length * 2]);
        // for (int i = 0; i < this.stack.length; i++) {
        //     temp[i] = this.stack[i];
        // }
        // this.stack = temp;
        this.stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public String toString() {
        String result = "";

        for (E item : stack) {
            result += "[" + item + "]";
        }
        return result;
    }
    
}
