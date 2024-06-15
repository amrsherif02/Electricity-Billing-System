
package electricity_billing_system;


public class neutralstate extends Subscriptionstate {

    public neutralstate(Subscription sub) {
        super(sub);
    }

    @Override
    public void oncancel() {
        sub.setNewstate(new cancelstate(sub));
       System.out.println("cancelled successfully");
    }

    @Override
    public void onactivate() {
      sub.setNewstate(new activestate(sub));
     System.out.println("activated successfully");
    }
    
    
}
