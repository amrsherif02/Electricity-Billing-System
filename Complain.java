
package electricity_billing_system;
import java.util.Date;


public class Complain {
    
   private ComplainState newstate;
   private int Complain_ID;
   private String Complain_Description;
   private Date date ;
   private Admin Admin_Complain;
   private Manager Manager_Complain;
   
     public Complain(){
        newstate = new pendingstate(this);
    }

    public Complain(String Complain_Description) {
        this.Complain_Description = Complain_Description;
    }
     
       public String getNewstate() {
        return newstate.getClass().getSimpleName();
    }
      

    public void setNewstate(ComplainState newstate) {
        this.newstate = newstate;
    }

    public int getComplain_ID() {
        return Complain_ID;
    }

    public void setComplain_ID(int Complain_ID) {
        this.Complain_ID = Complain_ID;
    }

    public String getComplain_Description() {
        return Complain_Description;
    }

    public void setComplain_Description(String Complain_Description) {
        this.Complain_Description = Complain_Description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Admin getAdmin_Complain() {
        return Admin_Complain;
    }

    public void setAdmin_Complain(Admin Admin_Complain) {
        this.Admin_Complain = Admin_Complain;
    }

    public Manager getManager_Complain() {
        return Manager_Complain;
    }

    public void setManager_Complain(Manager Manager_Complain) {
        this.Manager_Complain = Manager_Complain;
    }
    
    
        
    public void onrespond(){
        newstate.Respond_Complain();
    }
    
    public void onreject(){
                   newstate.Reject_Complain();
    }
    
    public void onreconsider(){
                   newstate.Reconsider_Complain();
    }
    
        public void onpending(){
                   newstate.Pending_Complain();
    }

 public void AddComplain(){

             DB.getInstance().AddComplain(this);

 }
}
