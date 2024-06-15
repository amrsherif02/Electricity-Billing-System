
package electricity_billing_system;


public class cancelstate extends Subscriptionstate {

    public cancelstate(Subscription sub) {
        super(sub);
    }

    @Override
    public void oncancel() {
       System.out.println("already cancelled");
    }

    @Override
    public void onactivate() {
         sub.setNewstate(new activestate(sub));
        System.out.println("activated successfully");
    }
    
}
