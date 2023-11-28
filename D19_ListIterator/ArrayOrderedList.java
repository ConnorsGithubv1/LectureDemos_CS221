import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ArrayOrderedList<E extends Comparable<E>> implements OrderedListADT<E> {
    private static final int DEFAULT_CAPACITY = 100;
    private static final int NOT_FOUND = -1;

    private E[] list;
    private int front, rear, count, modCount;

    public ArrayOrderedList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayOrderedList(int initialCapacity) {
        this.list = (E[])(new Comparable[initialCapacity]);
        front = rear = count = modCount = 0;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new EmptyCollectionException("ordered list");
        }
        return removeElement(front);
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new EmptyCollectionException("ordered list");
        }
        return removeElement(decrement(rear));
    }

    @Override
    public E remove(E element) {
        if (isEmpty()) {
            throw new EmptyCollectionException("ordered list");
        }
        // find the index of element
        return removeElement(find(element));
    }

    @Override
    public E first() {
        if (isEmpty()) {
            throw new EmptyCollectionException("ordered list");
        }
        return this.list[front];
    }

    @Override
    public E last() {
        if (isEmpty()) {
            throw new EmptyCollectionException("ordered list");
        }
        return this.list[decrement(rear)];
    }

    @Override
    public boolean contains(E target) {
        return find(target) != NOT_FOUND;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
       return this.count;
    }

    @Override
    public void add(E element) {
        if (this.size() == this.list.length){
            expandCapacity();
        }
        //find the insertion location
        int index = front;
        for (int i = 0; i < count && element.compareTo(list[index]) > 0; i++){
            index = increment(index);
        }
        // shift existing elements by one
        int shift = rear;
        while(shift != index) {
            this.list[shift] = this.list[decrement(shift)];
            shift = decrement(shift);
        }
        // insert new element
        list[index] = element;
        count++;
        modCount++;
        rear = increment(rear);
    }

    public String toString(){
        String result = "";
        int index = front;
        for(int i = 0; i < count; i++){
            result += this.list[index] + "\n";
            index = increment(index);
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity(){
        E[] larger = (E[])(new Comparable[list.length*2]);
        for(int i = 0; i <size(); i++){
            larger[i] = list[front];
            front = increment(front);
        }
        front = 0;
        rear = this.size();
        list = larger;
    }

    private int find(E element) {
        int index = front;
        for (int i = 0; i < count; i++) {
            if (element.equals(this.list[index])) {
                return index;
            }
            index = increment(index);
        }
        return NOT_FOUND;
    }

    private E removeElement(int index) {
        if (index == NOT_FOUND) {
            throw new NoSuchElementException();
        }
        E result = this.list[index];
        int leftIndex = index, rightIndex = increment(index);

        while (rightIndex < rear) {
            this.list[leftIndex] = this.list[rightIndex];
            leftIndex = increment(leftIndex);
            rightIndex = increment(rightIndex);
        }
        count--;
        modCount++;
        rear = decrement(rear);
        this.list[rear] = null;
        return result;
    }

    private int increment(int index) {
        return (index + 1) % this.list.length;
    }

    private int decrement(int index) {
        return (index - 1) % this.list.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayOrderedListIterator();
    }
    
    private class ArrayOrderedListIterator implements Iterator<E> {

        private int current; //the actual array index
        private int virtualIndex; // a virtual index coincident with a "normal" 0 to count -1 
        private int iterModCount; // snapshot of modcount
        private boolean canRemove; // flag for indicating a removal can happen

        private ArrayOrderedListIterator() {
            current = front;
            virtualIndex = 0;
            iterModCount = modCount;
            canRemove = false;
        }

        @Override
        public boolean hasNext() {
            if(iterModCount != modCount){
                throw new ConcurrentModificationException();
            }
            return virtualIndex < count;
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            E item = list[current];
            current = increment(current);
            virtualIndex++;
            canRemove = true;
            return item;
        }

        public void remove(){
            if(iterModCount != modCount){
                throw new ConcurrentModificationException();
            }
            if(!canRemove) {
                throw new IllegalStateException();
            }
            // remove the element in the array at index current-1
            // presumably decrement rear
            // presumably the modcount is getting incremented
            removeElement(decrement(current)); 
            iterModCount++;
            // all indices have to back up by one
            current = decrement(current);
            virtualIndex = Math.max(virtualIndex-1, 0);
            canRemove = false;
        }

    }

    public ListIterator<E> listIterator() {
        return new ArrayOrderedListListIterator();
    }

    public class ArrayCursor {
        private int virtualNextIndex;

        public ArrayCursor(int nextIndex){
            if (nextIndex < 0 || nextIndex > size()){ throw new IndexOutOfBoundsException();}
                this.virtualNextIndex = nextIndex;
        }

        public void rightShift(){
            
        }
    }

    private class ArrayOrderedListListIterator implements ListIterator<E> {

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'next'");
        }

        @Override
        public boolean hasPrevious() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'hasPrevious'");
        }

        @Override
        public E previous() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'previous'");
        }

        @Override
        public int nextIndex() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'nextIndex'");
        }

        @Override
        public int previousIndex() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'previousIndex'");
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'remove'");
        }

        @Override
        public void set(E e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'set'");
        }

        @Override
        public void add(E e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'add'");
        }
        
    }
}
