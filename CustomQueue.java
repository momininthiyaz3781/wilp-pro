//Task 4: Basic Exception Handling

//b) Develop a CustomQueue class with methods for Enqueue, Dequeue, Peek and Isempty. Show how your queue can handle different datatypes by enqueueing strings and integers, then dequeing and displaying them to confirm FIFO order.

import java.util.EmptyStackException;

public class CustomQueue<T> {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CustomQueue(int capacity) {
        queue = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full.");
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = (T) queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return item;
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) queue[front];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == queue.length;
    }

    public static void main(String[] args) {
        CustomQueue<String> stringQueue = new CustomQueue<>();
        stringQueue.enqueue("Wipro");
        stringQueue.enqueue("NGA");
        stringQueue.enqueue("Training");
        System.out.println("Dequeueing strings from the queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue());
        }
        CustomQueue<Integer> intQueue = new CustomQueue<>();
        intQueue.enqueue(60);
        intQueue.enqueue(15);
        intQueue.enqueue(50);
        System.out.println("Dequeueing integers from the queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());
        }
    }
}