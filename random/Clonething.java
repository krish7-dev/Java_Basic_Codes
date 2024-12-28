import java.lang.Cloneable;
import java.lang.CloneNotSupportedException;

public class Clonething {
    public static void main(String[] args) {

        try{
            Person p1 = new Person("Krisna", 12);
            Person copy = (Person) p1.clone();
            System.out.println(p1.toString());
            System.out.println(copy.toString());

        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        
    }
}

class Person implements Cloneable{
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Person{name="+name+" "+"age="+age+"}";
    }
}