/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity_billing_system;

import java.util.ArrayList;
import java.util.Date;

public class Warning  {
    private int Warning_ID;
    private String Warning_Description;
    private int Warning_Count;
    private String Date;
    private ArrayList<SendMail> custwarn;

    

    
    public Warning() {
        custwarn = new ArrayList<>();
    }

    public Warning(int Warning_ID, String Warning_Description, int Warning_Count, String Date) {
        this.Warning_ID = Warning_ID;
        this.Warning_Description = Warning_Description;
        this.Warning_Count = Warning_Count;
        this.Date = Date;
    }

    public ArrayList<SendMail> getCustwarn() {
        return custwarn;
    }

    public void setCustwarn(ArrayList<SendMail> custwarn) {
        this.custwarn = custwarn;
    }



    public int getWarning_ID() {
        return Warning_ID;
    }

    public void setWarning_ID(int Warning_ID) {
        this.Warning_ID = Warning_ID;
    }

    public String getWarning_Description() {
        return Warning_Description;
    }

    public void setWarning_Description(String Warning_Description) {
        this.Warning_Description = Warning_Description;
    }

    public int getWarning_Count() {
        return Warning_Count;
    }

    public void setWarning_Count(int Warning_Count) {
        this.Warning_Count = Warning_Count;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }


    public void Addtowarninglist(SendMail m){
        custwarn.add(m);
    }
    
        public void removefromwarninglist(SendMail m){
        custwarn.remove(m);
    }
    
      public void Send_Warning(){
            custwarn.forEach(m -> m.notify());
            DB.getInstance().Send_Warning();
        }
    
}
