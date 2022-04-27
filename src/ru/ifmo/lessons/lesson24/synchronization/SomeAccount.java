package ru.ifmo.lessons.lesson24.synchronization;

public class SomeAccount {
    private int balance;

    public int getBalance(){
        return balance;
    }

    /* synchronized метод блокирует монитор объекта, у которго
    *  вызывается метод */
    public /*synchronized*/ void upBalance(int count){
        balance += count;
    }
}
