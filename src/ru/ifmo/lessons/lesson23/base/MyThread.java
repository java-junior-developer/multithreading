package ru.ifmo.lessons.lesson23.base;

public class MyThread extends Thread {
    // перечисление всех
    // необходимых свойств, конструкторов и методов

    // инструкции, описанные в методе run
    // будут выполняться в отдельном потоке
    @Override
    public void run() {
        System.out.println(this.getName());
        System.out.println(Thread.currentThread().getName());
    }
}
