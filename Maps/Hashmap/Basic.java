package Maps.Hashmap;
import java.util.HashMap;
import java.util.Map;
public class Basic {
    public static void main(String args[]){
        Map<String,String> m1 = new HashMap<>();
        m1.put("Name", "Krishna");
        m1.put("Age", "25");
        System.out.println(m1.get("Name"));
    }
}
