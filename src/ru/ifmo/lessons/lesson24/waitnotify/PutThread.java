package ru.ifmo.lessons.lesson24.waitnotify;

public class PutThread implements Runnable{
    private Library library;

    public PutThread(Library library){
        this.library = library;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("put -> library");
            try {
                Thread.sleep((long)(Math.random() * 2000));
                library.putBook(new Library.Book());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}