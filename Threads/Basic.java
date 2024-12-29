package Threads;

class Counter{
    static int count=0;
    static void increment(){
        for(int i=0;i<50;i++){
            count++;
        }
    }
}

public class Basic {
    public static void main(String args[]){
        Thread t1 = new Thread(()->Counter.increment());
        Thread t2 = new Thread(()->Counter.increment());
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){

        }
        System.out.println(Counter.count);
    }
}
