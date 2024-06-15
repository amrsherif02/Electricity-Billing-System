
package electricity_billing_system;

import java.util.Date;
import java.util.Scanner;


public class Electricity_Billing_System {

  
    public static void main(String[] args) {
//        // Create a new subscription1
//        
//        Subscription subscription = new Subscription();
//
//        // Create a scanner object for user input
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            // Display current state
//            System.out.println("Current state: " + subscription.getNewstate());
//
//            // Display menu options
//            
//            System.out.println("1. Activate");
//            System.out.println("2. Cancel");
//            System.out.println("0. Exit");
//            
//
//            // Get user input
//            int choice = scanner.nextInt();
//
//            // Process user choice
//            switch (choice) {
//                case 1:
//                    // Activate subscription
//                    
//                    subscription.activate();
//                    break;
//                case 2:
//                    // Cancel subscription
//                 
//                    subscription.cancel();
//                    break;
//                case 0:
//                    // Exit loop
//                    System.out.println("Exiting...");
//                    return;
//                default:
//                    System.out.println("Invalid choice!");
//            }
//        }
//    }
    
          
        
//        Complain comp = new Complain();
//
//     
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//
//            System.out.println("Current state: " + comp.getNewstate());
//
//
//            
//            System.out.println("1. respond");
//            System.out.println("2. reject");
//            System.out.println("3. reconsider");
//            System.out.println("4. pending");
//            System.out.println("0. Exit");
//            
//
//
//            int choice = scanner.nextInt();
//
//
//            switch (choice) {
//                case 1:
//                    comp.onrespond();
//                    break;
//                case 2:
//                    // Cancel subscription
//                 
//                   comp.onreject();
//                    break;
//                      
//                case 3:
//                   comp.onreconsider();
//                    break;
//                case 4:
//                   comp.onpending();
//                    break;
//                case 0:
//                    // Exit loop
//                    System.out.println("Exiting...");
//                    return;
//                default:
//                    System.out.println("Invalid choice!");
//            }
//        }
 
        // Attempt to create multiple instances of Manager
//        Manager manager1 = Manager.getInstance(1, "John Doe");
//        Manager manager2 = Manager.getInstance(2, "fuck you");
//
//        // Check if both references point to the same instance
//        if (manager1 == manager2) {
//            System.out.println("Singleton pattern test passed: Both references point to the same instance.");
//        } else {
//            System.out.println("Singleton pattern test failed: Both references do not point to the same instance.");
//        }
//        System.out.println(manager2.getManager_ID());
//      Report R = new Report();
//      Admin a = new Admin(R);
//      
//       Bill bill = new Bill("Cash", null, null, new Date(), 100.0, 1, 0.0, 0.0, 0.0);
//       a.Add_Bill(bill);
        
        // Create a customer with the read-only interface
//         Customer customer = new Customer(R);
        
        // Customer reads the bill
//        System.out.println("Customer reading the bill:");
//        customer.read_Bill(0);
        
        // Try to modify the bill (should not be allowed)
        // This line will result in a compilation error since the customer interface does not have methods for modification
        // customer.setBill_Amount(150.0);
//  


//PaymentWay paypalPayment = new PayPal();
//        paypalPayment.CollectPaymentDetails(); // Simulate collecting payment details
//        paypalPayment.payBill(100.0); // Simulate payment
//        
//        // Test Visa payment
//        PaymentWay visaPayment = new PayVisa();
//        visaPayment.CollectPaymentDetails(); // Simulate collecting payment details
//        visaPayment.payBill(150.0); // Simulate paymen




//        Warning warning = new Warning(1, "High Energy Consumption", 3, new Date());

        // Create concrete observer instances
//        SendMail emailObserver1 = new SendMail("example1@example.com");
//        SendMail emailObserver2 = new SendMail("example2@example.com");

        // Add observers to the warning
//        warning.Addtowarninglist(emailObserver1);
//        warning.Addtowarninglist(emailObserver2);

        // Trigger warning
//        warning.Send_Warning();

}
    
    }
    
    

