package Streams;

import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;

public class Create {
    public static void main(String args[]) throws IOException{

        List<String> l = Arrays.asList("a", "b","a"); 
        String[] s = {"ab","cd","ef"};

        Stream<String> ls = l.stream(); //from list

        Stream<String> ss = Arrays.stream(s); //from array

        Stream<String> stream = Stream.of("one", "two", "three"); //stream of

        //Stream<String> lines = Files.lines(Paths.get("file.txt")); //from file
        
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2); //infinite stream


        ls.forEach(System.out::println);
    }

}
