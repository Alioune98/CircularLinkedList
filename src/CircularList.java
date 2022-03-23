//Implementation of a Circular Linked List
import java.util.Iterator;

public class CircularList<E> implements Iterable<E>{
    private Node<E> current;
    private int size;

    /**
     * Constructor for the CircularList
     */
    public CircularList() {
        this.current = null;
        this.size = 0;
    }

    /**
     * Inserts a new element at the current
     * position (the newly added element becomes
     * the current)
     * @param item to be added
     */
    public void add(E item){
        Node<E> value = new Node<>(item);
        if(current == null){
            current = value;
            current.next = current;
        }else{
            Node<E> temp = current; //Temporary variable that holds the current value of circular list
            current = value; //current is now equal to the new value;
            current.next = temp;
            temp = current;
            for(int i = 0; i < size; i++){ // while we are not at the end of the list
                temp = temp.next;
            }
            temp.next = current;
        }
        size++;
    }

    /**
     *
     * @return a reference to the contents of
     * the node at the current position
     */
    public E get(){
        if(current == null){
            return null;
        }
        return current.data;
    }

    /**
     *
     * @return the number of elements in the list
     */
    public int size(){
        return size;
    }

    /**
     *
     * @return an Iterator for the list
     */
    public Iterator<E> iterator(){
        return new CircIterator();
    }

    /**
     * Inner class implementation for the CircularList
     * @param <E> value type of list
     */
    static class Node<E> {
        private final E data;
        private Node<E> next;

        Node(E item){
            this.data = item;
            this.next = null;
        }
    }

    /**
     * Iterator for the CircularList class
     */
    public class CircIterator implements Iterator<E>{
        private Node<E> next;
        private Node<E> previous;
        private boolean nextCalled;

        /**
         * Constructor for CircIterator
         */
        CircIterator(){
            next = current.next;
            previous = current;
        }

        /**
         *
         * @return true unless the list is empty
         */
        @Override
        public boolean hasNext() {
            return size != 0;
        }

        /**
         *
         * @return the next Node of current
         */
        @Override
        public E next() {
            if (hasNext()){
                previous = current;
                current = current.next;
                next = current.next;
            }else{
                return null;
            }
            nextCalled = true;
            return next.data;
        }

        /**
         * removes the current Node
         */
        @Override
        public void remove() {
            if(nextCalled) {
                previous.next = previous.next.next;
                next();
                size--;
                nextCalled = false;
            }
            System.out.println("Next must be called first");
        }
    }
}
