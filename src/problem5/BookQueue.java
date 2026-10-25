package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> Bookqueue;

    public BookQueue() {
        this.Bookqueue = new LinkedList<>();
    }

    public void enqueue(Book book) {
        this.Bookqueue.addLast(book);
    }

    public Book dequeue() {
        return this.Bookqueue.removeFirst();
    }

    public Book peek() {

        return this.Bookqueue.getFirst();
    }

    public boolean isEmpty() {

        return this.Bookqueue.isEmpty();
    }

    public void display() {
        System.out.println("Queue contents (front to back):");
        for (Book book : this.Bookqueue) {
            System.out.println("- " + book);
        }
    }
}