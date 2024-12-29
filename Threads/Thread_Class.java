package Threads;

class Counter extends Thread{
    public void run(){
        System.out.println("Displying");
    }
}

public class Thread_Class {
    public static void main(String args[]){
        Counter c1 = new Counter();
        c1.start();
        
    }
}
