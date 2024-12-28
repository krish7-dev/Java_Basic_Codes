import java.lang.Cloneable;
import java.util.HashMap;
import java.util.Map;

public class Registry0 {
    public static void main(String args[]){
        Registry r1 = new Registry();
        User u1 = new User("ab", "cd", "ef", "gh", 2);
        User u2 = (User) u1.clone();
        System.out.println(u1);
        System.out.println(u2);
        r1.addPrototype("first", u1);
        r1.addPrototype("second", u2);
        System.out.println(r1.getPrototype("first"));
        System.out.println(r1.getPrototype("second"));
    }
}

interface ObjectClonable{
    static void print(){
        System.out.println("static print");
    }
    Object clone();
}

class User implements ObjectClonable{
    String userId, username, email, displayName;
    int age;

    public User(String userId,String username,String email,String displayName,int age){
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.displayName = displayName;
        this.age = age;
    }

    public Object clone(){
        return new User(this.userId, this.username, this.email, this.displayName, this.age);
    }
}

interface UserPrototypeRegistry{
    public void addPrototype(String key, User u);
}

class Registry implements UserPrototypeRegistry{

    private static Map<String, User> mp = new HashMap<>();

    public void addPrototype(String key, User u){
        mp.put(key, u);
    }
    public User getPrototype(String key){
        return mp.get(key);
    }
}