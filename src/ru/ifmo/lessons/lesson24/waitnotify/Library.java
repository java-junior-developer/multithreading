package ru.ifmo.lessons.lesson24.waitnotify;

import java.util.ArrayList;

// Object:
// wait(); - приостанавливает работу текущего потока до тех пор,
// пока поток не будет разбужен вызовом метода notify из дгугого потока
// wait(млс);

// notify(); - возобновляет работу случайного потока,
// который был приостановлен вызовом метода wait().
// Нельзя указать, какой именно потк должен возобновить работу

// notifyAll(); - возобновляет работу всех потоков,
// которые были приостановлены вызовом метода wait()

// можно вызывать только в synchronized методе или блоке


public class Library {
    private ArrayList<Book> books = new ArrayList<>(6);

    public synchronized void putBook(Book book) throws InterruptedException { // не более 6 книг
        // if (books.size() > 5) wait();'
        while (books.size() > 5) {
            wait();
        }
        books.add(book);
        System.out.println("add, count: " + books.size());
        notifyAll();
    }

    public synchronized Book getBook() throws InterruptedException { // нельзя получить книгу из пустой коллекции
        // if (books.size() == 0) wait();
        while (books.size() == 0) {
            wait();
        }
        Book book = books.remove(0);
        System.out.println("remove, count: " + books.size());
        notifyAll();
        return book;
    }

    static class Book{}
}