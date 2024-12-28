package Streams;


import java.util.Arrays;
import java.util.stream.Stream; // Explicitly import the Stream interface

public class MyStream {
    public static void main(String args[]){
        String[] array = {"aravind", "Akay", "c"};
        Stream<String> stream1 = Arrays.stream(array);
        stream1.filter(s->s.toLowerCase().startsWith("a")).forEach(s->System.out.println(s));
    }  
}
