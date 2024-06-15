/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity_billing_system;

/**
 *
 * @author DELL
 */
public class PayVisa_1 implements PaymentWay {

        
private int Card_Number;
    private String CardHolder_Name;
    private int CVV;

    PayVisa_1(String PayPal_Email, char[] passwordChars) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  

    @Override
    public void CollectPaymentDetails() {
        Card_Number=0;
        CardHolder_Name ="";
        CVV = 0;
    }

    public PayVisa_1(int Card_Number, String CardHolder_Name, int CVV) {
        this.Card_Number = Card_Number;
        this.CardHolder_Name = CardHolder_Name;
        this.CVV = CVV;
    }

    public PayVisa_1() {
    }
    

    public int getCard_Number() {
        return Card_Number;
    }

    public void setCard_Number(int Card_Number) {
        this.Card_Number = Card_Number;
    }

    public String getCardHolder_Name() {
        return CardHolder_Name;
    }

    public void setCardHolder_Name(String CardHolder_Name) {
        this.CardHolder_Name = CardHolder_Name;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }
        @Override
 public void Pay_Bill(){
//     Complain z = new Complain();
//     z.AddComplain(x);
             DB.getInstance().Pay_Visa();
        }

    
}
        
