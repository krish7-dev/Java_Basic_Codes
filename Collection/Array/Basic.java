package Collection.Array;

import java.util.ArrayList;

public class Basic {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(2);
        arr.add(3);

        System.out.println(arr);

        arr.set(0,4);
        arr.remove(1);

        System.out.println(arr);

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        arr.clear();
        
        System.out.println(arr);
    }
}
