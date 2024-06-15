
package electricity_billing_system;

import java.util.ArrayList;
import java.util.Date;

public class Subscription {
    private Subscriptionstate newstate;
    private int Subscription_ID ;
    private String Start_Date ;
    private String End_Date ; 

    public Subscription() {
    }


    
    
    
    public Subscription(int aInt, String string, String string1){
        newstate = new neutralstate(this);
    }

    public Subscription( int Subscription_ID, String Start_Date, String End_Date , Subscriptionstate newstate) {
        this.newstate = newstate;
        this.Subscription_ID = Subscription_ID;
        this.Start_Date = Start_Date;
        this.End_Date = End_Date;
    }



    
    public String getNewstate() {
        return newstate.getClass().getSimpleName();
    }
      

    public void setNewstate(Subscriptionstate newstate) {
        this.newstate = newstate;
    }

    public int getSubscription_ID() {
        return Subscription_ID;
    }

    public void setSubscription_ID(int Subscription_ID) {
        this.Subscription_ID = Subscription_ID;
    }

    public String getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(String Start_Date) {
        this.Start_Date = Start_Date;
    }

    public String getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(String End_Date) {
        this.End_Date = End_Date;
    }

      public void addSub()
    {
        String state = this.getNewstate() ;
        int id = this.getSubscription_ID();
        String date = this.getStart_Date();
        DB.getInstance().addSubscription(id, date, state);
        
    }
    
    
    public void cancel(){
        newstate.oncancel();
    }
    
        public void activate(){
            newstate.onactivate();        
    }    
}
