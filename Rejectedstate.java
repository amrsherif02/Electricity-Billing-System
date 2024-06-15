package electricity_billing_system;


public class Rejectedstate extends ComplainState {

    public Rejectedstate(Complain complain) {
        super(complain);
    }

    
    
    @Override
    public void Reject_Complain() {
        System.out.println("complain is already rejected");
    }

    @Override
    public void Respond_Complain() {
       System.out.println("complain cant be responded to");
    }

    @Override
    public void Pending_Complain() {
         System.out.println("complain cant be pending  ");
    }

    @Override
    public void Reconsider_Complain() {
         complain.setNewstate(new Reconsideredstate(complain));
        System.out.println("complain is reconsidereed sucessfully");
    }




    
    

    

}
