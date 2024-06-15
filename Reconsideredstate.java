package electricity_billing_system;
public class Reconsideredstate extends ComplainState {

    
    public Reconsideredstate(Complain complain) {
        super(complain);
    }

    
    @Override
    public void Reject_Complain() {
        complain.setNewstate(new Rejectedstate(complain));
        System.out.println("complain rejected sucessfully");
    }

    @Override
    public void Respond_Complain() {
         complain.setNewstate(new respondedstate(complain));
        System.out.println("complain responded sucessfully");
    }

    @Override
    public void Pending_Complain() {
        System.out.println("complain cant be pending it is in reconsideration process");
    }

    @Override
    public void Reconsider_Complain() {
        System.out.println("complain is already reconsidered");
    }
}
