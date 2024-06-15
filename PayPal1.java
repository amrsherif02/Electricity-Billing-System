/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity_billing_system;

/**
 *
 * @author DELL
 */

public class PayPal1 implements PaymentWay {
    private String PayPal_Email;
private String PayPal_Password;

    PayPal1() {

    }
   
    

//    @Override
//    public void payBill(double amount) {
//        System.out.println("Paying" + amount + "Using PayPal");
//    }

    @Override
    public void CollectPaymentDetails() {
PayPal_Email="";
PayPal_Password="";
    }

    public PayPal1(String PayPal_Email, String PayPal_Password) {
        this.PayPal_Email = PayPal_Email;
        this.PayPal_Password = PayPal_Password;
    }

    public String getPayPal_Email() {
        return PayPal_Email;
    }

    public void setPayPal_Email(String PayPal_Email) {
        this.PayPal_Email = PayPal_Email;
    }

    public String getPayPal_Password() {
        return PayPal_Password;
    }

    public void setPayPal_Password(String PayPal_Password) {
        this.PayPal_Password = PayPal_Password;
    }
    
//     public void Add(Bill b){
//        R.addbill(b);
//    }

    @Override
 public void Pay_Bill(){
             DB.getInstance().Pay_pal();
        }
    
}
