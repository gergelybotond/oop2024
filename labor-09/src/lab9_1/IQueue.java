package lab9_1;

// IQueue.java
public interface IQueue<T> {
    // Adds a new element to the queue
    void enQueue(T object);

    // Removes the first element of the queue and returns it
    T deQueue();

    // Prints the content of the queue
    void printQueue();

    // Checks if the queue is empty
    boolean isEmpty();

    // Checks if the queue is full
    boolean isFull();
}
