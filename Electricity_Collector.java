package electricity_billing_system;
import java.util.ArrayList;
import java.util.Date;


public class Electricity_Collector extends Employee {
    private String Covered_Area;
    private int Collector_ID;
    private ArrayList<Meter> MeterForCollector = new ArrayList<Meter>();

    public Electricity_Collector(String Covered_Area, int Collector_ID, String Name, int SSN, String DOB, String Position, String Address, int Phone_Number, String Shift, String Password) {
        super(Name, SSN, DOB, Position, Address, Phone_Number, Shift, Password);
        this.Covered_Area = Covered_Area;
        this.Collector_ID = Collector_ID;
    }

    
    
    public Electricity_Collector() {
    }
    
    public Electricity_Collector(String Name) {
        super(Name);
    }
    
    public String getCovered_Area() {
        return Covered_Area;
    }

    public void setCovered_Area(String Covered_Area) {
        this.Covered_Area = Covered_Area;
    }

    public int getCollector_ID() {
        return Collector_ID;
    }

    public void setCollector_ID(int Collector_ID) {
        this.Collector_ID = Collector_ID;
    }

    public ArrayList<Meter> getMeterForCollector() {
        return MeterForCollector;
    }

    public void setMeterForCollector(ArrayList<Meter> MeterForCollector) {
        this.MeterForCollector = MeterForCollector;
    }
    
        public void addCollector()
    {
        DB.getInstance().AddCollector(this);
    }
        
       public void deleteCollector(int f)
    {
        DB.getInstance().deleteCollector(f);
    }
       
     public boolean collectorlogin(int id , String pass){
        boolean block =  DB.getInstance().authenticateCollector(id, pass);
        if(block){
            return true;
        }
        else{
            return false ;
        }
     
     }
       

    
}
