package Threads;

class Counter implements Runnable{
    public void run(){
        System.out.println("Running");
    }
    public void run2(){
        System.out.println("Running2");
    }
}

public class Runnable_interface {
    public static void main(String args[]){
        Counter task = new Counter();
        Thread t1 = new Thread(task);
        t1.start();
    }
}
