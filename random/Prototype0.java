import java.lang.Cloneable;

public class Prototype0 {
    public static void main(String args[]){
        AcerAspire p1 = new AcerAspire("laptop ", "windows ", 12, 256, 1024);
        AcerAspire p2 = (AcerAspire) p1.clone();
        p2.toString();
    }    
}

class AcerAspire implements Cloneable{
    String deviceType,OS;
    int ssd,hdd,ram;
    public AcerAspire(String deviceType, String OS,int ram,int ssd,int hdd){
        this.deviceType = deviceType;
        this.OS = OS;
        this.ram = ram;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported", e);
        }
    }

    public String toString(){
        System.out.println(ram+deviceType+ssd+OS+hdd);
        return "";
    }
}