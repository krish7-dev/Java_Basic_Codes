package Collection.Vector;

import java.util.Vector;
import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String args[]) throws InterruptedException{
        List<Integer> list = new Vector<>();
        list.add(0);

        Runnable task = ()->{
            for (int i=0;i<10000;i++){
                //synchronized (list){
                    int value = list.get(0);
                    list.set(0,++value);
                //}
            }
        };

        Thread[] threads = new Thread[10];
        for(int i=0;i<10;i++){
            threads[i]=new Thread(task);
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }

        // Print the final value
        System.out.println("Final Counter Value: " + list.get(0));
    }   
}
