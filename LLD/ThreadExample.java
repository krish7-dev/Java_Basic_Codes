package LLD;
class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running: " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        /*MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();
        thread3.start();*/

        for(int i=0;i<5;i++){
            String threadName = "thread " + i;
            MyThread thread = new MyThread(threadName);
            thread.start();
        }
    }
}
