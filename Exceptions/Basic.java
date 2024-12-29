package Exceptions;

class MoreThanHundredException extends Exception{
    public MoreThanHundredException(){
        super("More than 100 count");
        //System.out.println("More than 100 counts"); //we can implement this too but
                                                      //we cant print getmessage at exception block 
    }
    public MoreThanHundredException(String message) {
        //super(message);
    }
}

class Counter{
    static int Count=0;
    static void increment() throws MoreThanHundredException{
        if(Count>100){
            //throw new MoreThanHundredException("Here at more than 100 error"); 
            throw new MoreThanHundredException(); 
        }
        Count++;
    }
}

public class Basic {
    public static void main(String args[]){
        try{
            for(int i=0;i<=101;i++){
                Counter.increment();
            }
        }catch(Exception e){
            System.out.println(e.getMessage()); 
            e.printStackTrace();
        }finally{
            System.out.println("Final Block");
        }
    }
}
