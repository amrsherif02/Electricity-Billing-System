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
public class Report implements ReadOnly_Bill, ReadOnly_Report {
    private int Report_ID;
    private Date Report_Month;
    private double Report_Amount;
    private ArrayList<Bill> MonthlyBillArray = new ArrayList<Bill>();

    public Report(int Report_ID, Date Report_Month, double Report_Amount, int Branch_ID) {
        this.Report_ID = Report_ID;
        this.Report_Month = Report_Month;
        this.Report_Amount = Report_Amount;
  
    }

    public Report() {
    }
    

    public int getReport_ID() {
        return Report_ID;
    }

    public void setReport_ID(int Report_ID) {
        this.Report_ID = Report_ID;
    }

    public Date getReport_Month() {
        return Report_Month;
    }

    public void setReport_Month(Date Report_Month) {
        this.Report_Month = Report_Month;
    }

    public double getReport_Amount() {
        return Report_Amount;
    }

    public void setReport_Amount(double Report_Amount) {
        this.Report_Amount = Report_Amount;
    }

    public ArrayList<Bill> getMonthlyBillArray() {
        return MonthlyBillArray;
    }

    public void setMonthlyBillArray(ArrayList<Bill> MonthlyBillArray) {
        this.MonthlyBillArray = MonthlyBillArray;
    }

    @Override
    public void read_Bill(int index) {
        System.out.println(MonthlyBillArray.get(index));
    }
    
    public void addbill(Bill b){
        MonthlyBillArray.add(b);
    }
        public void deletebill(Bill b){
        MonthlyBillArray.remove(b);
    }
    
        
 public void EditReport(Report i){
            
        }
   @Override
        public void Read_Report(Report report){
            
        }
}
