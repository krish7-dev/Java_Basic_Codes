package Collection.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListThreadUnsafeExample {
    public static void main(String[] args) throws InterruptedException {
        
        //List<Integer> list = new ArrayList<>(); // Synchronized
        List<Integer> list = new Vector<>(); // Synchronized

        Runnable task = () -> list.add(1); // Each thread adds a single element

        Thread[] threads = new Thread[10000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task); // Initialize each thread with the task
            threads[i].start(); // Start the thread
        }
        
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Final List Size: " + list.size());
    }
}
