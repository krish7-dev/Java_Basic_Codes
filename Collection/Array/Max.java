package Collection.Array;

import java.util.ArrayList;
import java.util.Random;

public class Max {
    public static void main(String args[]){
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(rand.nextInt(100));
        }
        System.out.println(arr);
        int large=arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(large<arr.get(i)){
                large=arr.get(i);
            }
        }
        System.out.println(large);
    }
}
