
package electricity_billing_system;

import java.util.ArrayList;
import java.util.Date;


public class Manager extends Admin {
    private int Manager_ID;
    private double pricerate;
    private ArrayList<Warning> Manager_Warning = new ArrayList<Warning>();
    private ArrayList<Report> Manager_report = new ArrayList<Report>();
    private ArrayList<Complain> Complain_manager_array = new ArrayList<Complain>();
    private static volatile Manager UniqueInstance;

    
    private Manager(int Manager_ID, String Name) {
        super(Name);
        this.Manager_ID = Manager_ID;
    }
        private Manager() {
        super("Amr"); // Default name
        this.Manager_ID = 2; // Default ID or any default value
    }
    
    public int getManager_ID() {
        return Manager_ID;
    }

    public double getPricerate() {
        return pricerate;
    }

    public void setPricerate(double pricerate) {
        this.pricerate = pricerate;
    }
    
    
    
    public static Manager getInstance(int ID , String Name){
        Manager result = UniqueInstance;
        if(result==null){
            synchronized(Manager.class){
                result = UniqueInstance;
                if(result==null){
                    UniqueInstance = result = new Manager(ID,Name);
                }
            }
        }
        return result;
    }
        public static Manager getInstance(){
        Manager result = UniqueInstance;
        if(result==null){
            synchronized(Manager.class){
                result = UniqueInstance;
                if(result==null){
                    UniqueInstance = result = new Manager();
                }
            }
        }
        return result;
    }
    
    public void Change_Price_Rate(double newp){
          this.pricerate = newp;
          DB.getInstance().Change_Price_Rate(newp);
    }
    
        public void addECollecter(Electricity_Collector f)
    {
       f.addCollector();
    }
        
     public void DeleteECollecter(int f)
    {
       Electricity_Collector c = new Electricity_Collector(); 
       c.deleteCollector(f);
    }
     
     public void updateCollector(int d,String address, String shift, String area,String position,int number){
        DB.getInstance().updateCollector(d,position,address,shift,area,number );
    }
     
     
     public boolean managerlogin(int id , String pass){
        boolean b =  DB.getInstance().authenticateManager(id, pass);
        if(b){
            return true;
        }
        else{
            return false ;
        }
     
     }
      public void EditReport(Report report, int NewReport_ID, Date newReport_Month, double newReport_Amount ) 
      {
          report.setReport_ID(NewReport_ID);
          report.setReport_Month(newReport_Month);
          report.setReport_Amount(newReport_Amount);
      }

}
