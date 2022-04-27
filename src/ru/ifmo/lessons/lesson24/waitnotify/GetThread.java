package ru.ifmo.lessons.lesson24.waitnotify;

public class GetThread implements Runnable{
    private Library library;

    public GetThread(Library library) {
        this.library = library;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("get -> library" + library.getBook());
                Thread.sleep((long)(Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}