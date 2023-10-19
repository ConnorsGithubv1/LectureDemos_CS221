public class LinearNode<E> {
    
    private LinearNode<E> next;
    private E element;

    public LinearNode() {
        this(null);
    }

    public LinearNode(E element) {
        this.next = null;
        this.element = element;
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNext(LinearNode<E> next) {
        this.next = next;
    }

    public LinearNode<E> getNext() {
        return this.next;
    }

    public String toString() {
        return this.element.toString();
    }

}
