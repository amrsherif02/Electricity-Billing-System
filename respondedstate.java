
package electricity_billing_system;


public class respondedstate extends ComplainState {

    public respondedstate(Complain complain) {
        super(complain);
    }

    
    @Override
    public void Reject_Complain() {
        System.out.println("complain cant`  "
                + " be rejected");
    }

    @Override
    public void Respond_Complain() {
         System.out.println("complain is already responded");
    }

    @Override
    public void Pending_Complain() {
        System.out.println("complain cant be pending");
    }

    @Override
    public void Reconsider_Complain() {
        complain.setNewstate(new Reconsideredstate(complain));
        System.out.println("complain is reconsidereed sucessfully");
    }



}
