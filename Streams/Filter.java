package Streams;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.event.SwingPropertyChangeSupport;

import java.util.Collection;
import java.util.List;
import java.util.Arrays;

public class Filter {
    public static void main(String args[]){
        int[] array = {5,6,3,4,5};
        IntStream sf = Arrays.stream(array);
        IntStream sm = Arrays.stream(array);
        IntStream ss = Arrays.stream(array);
        IntStream ss2 = Arrays.stream(array);
        IntStream sd = Arrays.stream(array);

        sf.filter(e->e%2==0).forEach(System.out::println);
        sm.map(e->e*2).forEach(System.out::println);
        System.out.println(ss.sorted().boxed().collect(Collectors.toList()));  //Liist<Integer> sortedlist = 
        ss2.sorted().forEach(System.out::println);
        System.out.println("Distinct");
        sd.distinct().forEach(System.out::println);
    }
}


