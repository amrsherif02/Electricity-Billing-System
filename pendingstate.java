
package electricity_billing_system;


public class pendingstate extends ComplainState {

     public pendingstate(Complain complain) {
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
        System.out.println("complain is already pending");
    }

    @Override
    public void Reconsider_Complain() {
         System.out.println("complain cant be reconsidered");
    }

}
