import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;;

public class Registry1 {
    public static void main(String args[]){
        Invoice i1 = new Invoice("i1", "Krish", "bill", 1000, LocalDate.now());
        Invoice i2 = (Invoice) i1.clone();
        Registry r = new Registry();
        r.addPrototype("i1",i1);
        System.out.println(r.getPrototype("i1"));
        System.out.println(i1);
        System.out.println(i2);
    }
}

interface ObjectClonable{
    public Object clone();
}

class Invoice implements ObjectClonable{
    String invoiceId, customerName, invoiceType;
    float amount;
    LocalDate dueDate;

    public Invoice(String invoiceId, String customerName, String invoiceType, float amount, LocalDate dueDate){
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.invoiceType = invoiceType;
        this.amount = amount;
        this.dueDate = dueDate;
    }
    public Object clone(){
        return new Invoice(this.invoiceId,this.customerName,this.invoiceType,this.amount,this.dueDate);
    }
}

interface InvoicePrototypeRegistry{
    public void addPrototype(String key, Invoice i);
    public Object getPrototype(String key);
}

class Registry implements InvoicePrototypeRegistry{
    private static Map<String,Invoice> mp = new HashMap<>();

    public void addPrototype(String key, Invoice i){
        mp.put(key, i);
    }

    public Object getPrototype(String key){
        return mp.get(key);
    }
}