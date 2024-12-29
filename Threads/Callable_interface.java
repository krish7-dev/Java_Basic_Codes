package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Counter implements Callable<String>{
    public String call(){
        return "s";
    }
}

public class Callable_interface {
    public static void main(String args[]) throws Exception{
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<String> future = ex.submit(new Counter());
        System.out.println(future.get());
        ex.shutdown();
    }   
}
