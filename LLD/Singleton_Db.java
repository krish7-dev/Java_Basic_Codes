
public class Singleton_Db {
    private static Singleton_Db connection1 = null;
    private Singleton_Db(){
    }
    public static Singleton_Db getConnection(){
        if(connection1 !=null){
            return connection1;
        }
        else{
            return connection1=new Singleton_Db();
        }
    }
    public void endConnection(){
        connection1 = null;
    }
}
