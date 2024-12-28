import Trial.A;
import lld2.foldersingleton.B;

public class B extends A {
    public static void main(String args[]){
        A a1 = new A();
        B b1 = new B();
        B.getDisplay(b1);
    }
}

class D{
    public static void display(){
        System.out.println("D printing");
    }
}

//public