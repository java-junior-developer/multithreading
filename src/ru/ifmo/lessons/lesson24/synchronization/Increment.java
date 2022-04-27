package ru.ifmo.lessons.lesson24.synchronization;

public class Increment extends Thread{
    private SomeAccount account;

    public Increment(SomeAccount account) {
        this.account = account;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // synchronized блок - блокирует монитор объекта из ( ),
        // в данном случае account
        // операции не свзязанные с изменением свойств объекта из (),
        // в данном случае account, не должны вкладываться
        // в synchronized блок
        synchronized (account) {
            account.upBalance(10);
        }
    }
}
