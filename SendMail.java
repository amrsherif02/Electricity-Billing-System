/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity_billing_system;

/**
 *
 * @author DELL
 */
public class SendMail implements observer {

    private final String mail ;

    public SendMail( String n) {
        this.mail = n;
    }

    @Override
    public void notifycust() {
        System.out.println("warning mail is sent");
    }
    
}
