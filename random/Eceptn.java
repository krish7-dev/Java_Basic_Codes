import java.lang.Exception;

public class Eceptn {
    public static void main(String args[]){
        mj m1=new mj(10);
        m1.display();
    }
}

class mj{
    float a=0;
    mj(int a){
        this((float)a);
        int b=(int)a;
        System.out.println("Calling int"+b);
    }
    mj(float a){
        System.out.println("calling float");
        this.a = this.a+a;
    }
    void display(){
        System.out.println(a);
    }
}