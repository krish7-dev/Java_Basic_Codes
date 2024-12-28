package Threads;

class Counter extends Thread{
    static int count=0;

    static void increment(){
        count++;
    }
    public void start(int limit){
        for(int i=0;i<limit;i++){
            increment();
        }
    }
    public void display(){
        System.out.println("Count : "+count);
    }
}

public class Thread_class {
    public static void main(String args[]){
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.start(10000);
        c2.start(10000);
        try{
            c1.join();
            c2.join();
        }
        catch(Exception e){

        }
        System.out.println("Thread Class");
        c1.display();
        c2.display();
        System.out.println(Counter.count);
    }
}
