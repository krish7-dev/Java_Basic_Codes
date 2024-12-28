import java.lang.StringBuilder;

public class Factory0{
    public static void main(String args[]){
        Factory0 t1 = new Factory0();
        Factory0 t2 = new Factory0();
        Factory0 t3 = t1;
        
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false
        System.out.println(t1.equals(t3)); // true
        System.out.println(t1==t3); // true
             
    }
}