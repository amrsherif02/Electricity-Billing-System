/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity_billing_system;

import java.util.ArrayList;
import java.util.Date;


public class Bill {
    private String Cash_Or_Visa;
    private Report Bill_report;
    private Payment Pay;
    private Date Bill_Date;
    private double Bill_Amount;
    private int ID;
    private double Discount_Amount;
    private double Discount_Percentage;
    private double additionalcharges;

    public Bill(String Cash_Or_Visa, Report Bill_report, Payment Pay, Date Bill_Date, double Bill_Amount, int ID, double Discount_Amount, double Discount_Percentage, double additionalcharges) {
        this.Cash_Or_Visa = Cash_Or_Visa;
        this.Bill_report = Bill_report;
        this.Pay = Pay;
        this.Bill_Date = Bill_Date;
        this.Bill_Amount = Bill_Amount;
        this.ID = ID;
        this.Discount_Amount = Discount_Amount;
        this.Discount_Percentage = Discount_Percentage;
        this.additionalcharges = additionalcharges;
    }

    public Bill() {
    }

    
    public String getCash_Or_Visa() {
        return Cash_Or_Visa;
    }

    public void setCash_Or_Visa(String Cash_Or_Visa) {
        this.Cash_Or_Visa = Cash_Or_Visa;
    }

    public Report getBill_report() {
        return Bill_report;
    }

    public void setBill_report(Report Bill_report) {
        this.Bill_report = Bill_report;
    }

    public Payment getPay() {
        return Pay;
    }

    public void setPay(Payment Pay) {
        this.Pay = Pay;
    }

    public Date getBill_Date() {
        return Bill_Date;
    }

    public void setBill_Date(Date Bill_Date) {
        this.Bill_Date = Bill_Date;
    }

    public double getBill_Amount() {
        return Bill_Amount;
    }

    public void setBill_Amount(double Bill_Amount) {
        this.Bill_Amount = Bill_Amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getDiscount_Amount() {
        return Discount_Amount;
    }

    public void setDiscount_Amount(double Discount_Amount) {
        this.Discount_Amount = Discount_Amount;
    }

    public double getDiscount_Percentage() {
        return Discount_Percentage;
    }

    public void setDiscount_Percentage(double Discount_Percentage) {
        this.Discount_Percentage = Discount_Percentage;
    }

    public double getAdditionalcharges() {
        return additionalcharges;
    }

    public void setAdditionalcharges(double additionalcharges) {
        this.additionalcharges = additionalcharges;
    }

    @Override
    public String toString() {
        return "Bill{" + "Cash_Or_Visa=" + Cash_Or_Visa + ", Pay=" + Pay + ", Bill_Date=" + Bill_Date + ", Bill_Amount=" + Bill_Amount + ", ID=" + ID + ", Discount_Amount=" + Discount_Amount + ", Discount_Percentage=" + Discount_Percentage + ", additionalcharges=" + additionalcharges + '}';
    }
    
    public double calculatebill(Bill B ,double r,double pricerate){
        double billamount = r*pricerate;
        int id = B.getID();
        DB.getInstance().updateBillAmount(id, billamount);
        return billamount ;
        
    }
    
}
