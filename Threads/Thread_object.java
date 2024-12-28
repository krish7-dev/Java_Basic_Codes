package Threads;

class Counter{
    static int count=0;

    static void increment(){
        count++;
    }
}

public class Thread_object {
    public static void main(String[] args){
        System.out.println("Basic Thread");

        Thread t1 = new Thread(()->{
            for(int i=0;i<100;i++){
                Counter.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<50;i++){
                Counter.increment();
            }
        });
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println("Error");
        }
        t2.start();
        try{
            t2.join();
        }
        catch(Exception e){
            System.out.println("Error");
        }


        
        System.out.println(Counter.count);
    }
}
