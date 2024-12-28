package Lambda;

interface Car{
    void Start();
    void Off();
}

public class AnonymousFunction {
    public static void main(String args[]){
        Car Bmw = new Car(){
            public void Start() {
                System.out.println("BMW Starting");
            };
            public void Off(){
                System.out.println("BMW Turning Off");
            }
        };
        Bmw.Start();
        Bmw.Off();
    }
}
