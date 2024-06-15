package electricity_billing_system;
import java.util.Date;


public class Meter {
    private int Meter_ID;
    private int collector_ID;
    private String Installation_Date;
    private Double Meter_Reading;
    private Boolean Meter_State;

    public Meter() {
    }

    public Meter(int Meter_ID, int collector_ID, String Installation_Date, Double Meter_Reading, Boolean Meter_State) {
        this.Meter_ID = Meter_ID;
        this.collector_ID = collector_ID;
        this.Installation_Date = Installation_Date;
        this.Meter_Reading = Meter_Reading;
        this.Meter_State = Meter_State;
    }

    
    


    public int getMeter_ID() {
        return Meter_ID;
    }

    public void setMeter_ID(int Meter_ID) {
        this.Meter_ID = Meter_ID;
    }

    public int getCollector_ID() {
        return collector_ID;
    }

    public void setCollector_ID(int collector_ID) {
        this.collector_ID = collector_ID;
    }



    public String getInstallation_Date() {
        return Installation_Date;
    }

    public void setInstallation_Date(String Installation_Date) {
        this.Installation_Date = Installation_Date;
    }



    public Double getMeter_Reading() {
        return Meter_Reading;
    }

    public void setMeter_Reading(Double Meter_Reading) {
        this.Meter_Reading = Meter_Reading;
    }

    public Boolean getMeter_State() {
        return Meter_State;
    }

    public void setMeter_State(Boolean Meter_State) {
        this.Meter_State = Meter_State;
    }
    
    void updatemeterReading(int id , double reading){
        this.setMeter_Reading(reading);
        DB.getInstance().updatemeterreading(id,reading);
        
    }
    
   void changemeterstate(int id ){
        Meter m = DB.getInstance().getmeterByid(id);
        Boolean state = DB.getInstance().getMeterStatusById(id);
        
        if(state==true){
            m.setMeter_State(false);
            DB.getInstance().updatemeterstate(id, false);
        }
                
        else if(state==false){
            m.setMeter_State(true);
            DB.getInstance().updatemeterstate(id, true);
        }   
    }
}
