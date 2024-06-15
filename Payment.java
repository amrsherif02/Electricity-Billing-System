/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity_billing_system;

import java.util.ArrayList;
import java.util.Date;

public class Payment {
    private int Payment_ID;
    private double Amount;

    public Payment(int Payment_ID, double Amount) {
        this.Payment_ID = Payment_ID;
        this.Amount = Amount;
    }

    public int getPayment_ID() {
        return Payment_ID;
    }

    public void setPayment_ID(int Payment_ID) {
        this.Payment_ID = Payment_ID;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
   
    
}
