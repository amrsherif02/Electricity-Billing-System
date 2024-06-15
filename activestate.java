
package electricity_billing_system;


public class activestate extends Subscriptionstate {

    public activestate(Subscription sub) {
        super(sub);
    }

    @Override
    public void oncancel() {
         sub.setNewstate(new cancelstate(sub));
        System.out.println("cancelled successfully");
    }

    @Override
    public void onactivate() {
         System.out.println("already active");
    }
    
}
