class Car{
    int mileage;
    String Name;

    private Car(CarBuilder c){
        this.mileage = c.mileage;
        this.Name = c.Name;
    }

    static class CarBuilder{
        int mileage;
        String Name;
        
        Car.CarBuilder setMileage(int mileage){
            this.mileage = mileage;
            return this;
        }
        Car.CarBuilder setName(String Name){
            this.Name = Name;
            return this;
        }
        Car build(){
            Car c = new Car(this);
            return c;
        }
    }
}
public class Builder {
    public static void main(String args[]){
        Car a = new Car.CarBuilder().setName("BMW").setMileage(10).build();
        System.out.println(a.Name+", Mileage: "+a.mileage);
    }
}
