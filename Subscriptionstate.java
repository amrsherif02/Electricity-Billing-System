
package electricity_billing_system;

public abstract class Subscriptionstate {
    protected Subscription sub;

    public Subscriptionstate(Subscription sub) {
        this.sub = sub;
    }
    
    public abstract void oncancel();
    public abstract void onactivate();
}
