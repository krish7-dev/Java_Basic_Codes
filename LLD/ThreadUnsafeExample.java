class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadUnsafeExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create two threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
            System.out.println("Count from t1: " + counter.getCount());
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
            System.out.println("Count from t2: " + counter.getCount());
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
            System.out.println("Count from t3: " + counter.getCount());
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Expected count = 2000, but actual count may be less due to race conditions
        System.out.println("Final Count: " + counter.getCount());
    }
}
