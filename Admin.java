/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity_billing_system;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Admin extends Employee {
    private int Office_Number ;
    private int Admin_ID ;
    private ArrayList<Complain> Complain_Admin_Array = new ArrayList<Complain>();
    private ArrayList<Warning> Employee_Warning = new ArrayList<Warning>();
    private Report R ;
    private  Warning warning ;

  public Admin(){
      warning = new Warning() ;
  }
    
    public Admin(String Name) {
        super(Name);
    }

    /*    public Admin() {
    }*/
    

    public Admin(Report R) {
        this.R = R;
    }

    public Report getR() {
        return R;
    }

    public void setR(Report R) {
        this.R = R;
    }
    
    
    
    
//    public Admin(String name, int SSn, Date DOB, String position, String Address, int Phone_Number, Boolean Shift) {
//        super(name, SSn, DOB, position, Address, Phone_Number, Shift);
//    }
//
//    public Admin(int Office_Number, int Admin_ID, String name, int SSn, Date DOB, String position, String Address, int Phone_Number, Boolean Shift) {
//        super(name, SSn, DOB, position, Address, Phone_Number, Shift);
//        this.Office_Number = Office_Number;
//        this.Admin_ID = Admin_ID;
//    }
    

    public int getOffice_Number() {
        return Office_Number;
    }

    public void setOffice_Number(int Office_Number) {
        this.Office_Number = Office_Number;
    }

    public int getAdmin_ID() {
        return Admin_ID;
    }

    public void setAdmin_ID(int Admin_ID) {
        this.Admin_ID = Admin_ID;
    }

    public ArrayList<Complain> getComplain_Admin_Array() {
        return Complain_Admin_Array;
    }

    public void setComplain_Admin_Array(ArrayList<Complain> Complain_Admin_Array) {
        this.Complain_Admin_Array = Complain_Admin_Array;
    }

    public ArrayList<Warning> getEmployee_Warning() {
        return Employee_Warning;
    }

    public void setEmployee_Warning(ArrayList<Warning> Employee_Warning) {
        this.Employee_Warning = Employee_Warning;
    }
    
    public void Add_Bill(Bill b){
        R.addbill(b);
    }
        public void remove_Bill(Bill b){
        R.deletebill(b);
    }
    
 
    public void addCust(Customer f , Subscription S)
    {
        S.addSub();
       f.addCust(S);
    }
        
     public void DeleteCust(int f)
    {
       Customer c = new Customer(); 
       c.deletecust(f);
    }
    
    public void Warn(){
        warning.Send_Warning();
    }
    
    public void deleteAdmin(int x){
       
       DB.getInstance().deleteAdmin(x);
   }

    public void addAdmin(){
       
     DB.getInstance().addAdmin(this);
         
   }
    
   public void calculatebill2(Bill B, double R){
     Manager m = Manager.getInstance();  
     double d = m.getPricerate();
     
     B.calculatebill(B ,R, d);
     
    }
   
   public boolean Adminlogin(int id , String pass){
        boolean b =  DB.getInstance().authenticateAdmin(id, pass);
        if(b){
            return true;
        }
        else{
            return false ;
        }
     }
    
   //@Override
    public void Read_Report(Report report) {
    }

}
