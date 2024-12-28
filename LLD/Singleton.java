
public class Singleton {
    public static void main(String args[]){
        Singleton_Db conn1 = Singleton_Db.getConnection();
        System.out.println("config");
        System.out.println(conn1);
        conn1.endConnection();
    }
}

