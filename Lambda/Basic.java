package Lambda;

interface MathOperation{
    int calculate(int a,int b);
}

public class Basic {
    public static void main(String args[]){
        System.out.println("lambda basic");
        int a=3,b=4;
        MathOperation addition = (c,d)->a+b;
        MathOperation subtract = (c,d)->a-b;
        System.out.println(addition.calculate(a,b));
        System.out.println(subtract.calculate(a,b));
       
    }
}
