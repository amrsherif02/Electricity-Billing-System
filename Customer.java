/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity_billing_system;


import java.util.ArrayList;


public class Customer  {
    private String Name;
    private int Cust_ID;
    private Subscription Cust_Subscription;
    private  String Address;
    private int Phone_Number;
    private Meter Customer_Meter;
    private String Area;
    private String mail;
    private String Date_Of_Subscription;
    private ArrayList<Bill> CustomerBillArray = new ArrayList<Bill>();
    private ArrayList<Payment> Customer_Payment = new ArrayList<Payment>();
    private ReadOnly_Bill Bill;

    public Customer(String Name, int Cust_ID, Subscription Cust_Subscription, String Address, int Phone_Number, Meter Customer_Meter, String Area, String Date_Of_Subscription) {
        this.Name = Name;
        this.Cust_ID = Cust_ID;
        this.Cust_Subscription = Cust_Subscription;
        this.Address = Address;
        this.Phone_Number = Phone_Number;
        this.Customer_Meter = Customer_Meter;
        this.Area = Area;
        this.Date_Of_Subscription = Date_Of_Subscription;
    }

    public Customer() {
    }

    public Customer(String Name, int Cust_ID, String Address, int Phone_Number, String Area, String Date_Of_Subscription) {
        this.Name = Name;
        this.Cust_ID = Cust_ID;
        this.Address = Address;
        this.Phone_Number = Phone_Number;
        this.Area = Area;
        this.Date_Of_Subscription = Date_Of_Subscription;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getCust_ID() {
        return Cust_ID;
    }

    public void setCust_ID(int Cust_ID) {
        this.Cust_ID = Cust_ID;
    }

    public Subscription getCust_Subscription() {
        return Cust_Subscription;
    }

    public void setCust_Subscription(Subscription Cust_Subscription) {
        this.Cust_Subscription = Cust_Subscription;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(int Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public Meter getCustomer_Meter() {
        return Customer_Meter;
    }

    public void setCustomer_Meter(Meter Customer_Meter) {
        this.Customer_Meter = Customer_Meter;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getDate_Of_Subscription() {
        return Date_Of_Subscription;
    }

    public void setDate_Of_Subscription(String Date_Of_Subscription) {
        this.Date_Of_Subscription = Date_Of_Subscription;
    }



    public ArrayList<Bill> getCustomerBillArray() {
        return CustomerBillArray;
    }

    public void setCustomerBillArray(ArrayList<Bill> CustomerBillArray) {
        this.CustomerBillArray = CustomerBillArray;
    }

    public ArrayList<Payment> getCustomer_Payment() {
        return Customer_Payment;
    }

    public void setCustomer_Payment(ArrayList<Payment> Customer_Payment) {
        this.Customer_Payment = Customer_Payment;
    }
    
    public Customer(ReadOnly_Bill i){
        this.Bill=i;
    }
    
    
    public void read_Bill( int index){
        Bill.read_Bill(index);
    }
    
      public void addCust(Subscription s)
    {
        
        int sid = s.getSubscription_ID();
        DB.getInstance().AddCust(this,sid);
        
    }
      
        
       public void deletecust(int f)
    {
        DB.getInstance().deleteCust(f);
    }
       
      public void calcB(){
          Admin A = new Admin();
          Double R = Customer_Meter.getMeter_Reading();
          Bill B = new Bill();
          int id = DB.getInstance().addBillk(B);
          B.setID(id);
          CustomerBillArray.add(B);
          A.calculatebill2(B,R);
      } 
 
       public void updateCustomer(int i, String add, int phonenumber, String area){
         DB.getInstance().updateCustomer(i,add,area,phonenumber);  
       }

        public void Pay_Bill(PayVisa_1 a){
       a.Pay_Bill();
       }
       
        public void Pay_Billl(PayPal1 a){
       a.Pay_Bill();
       }
         public void AddComplain(Complain n)
    {
       n.AddComplain();
    }
}
