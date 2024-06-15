
package electricity_billing_system;


public abstract class ComplainState {
 
      protected Complain complain ;
     
         public ComplainState(Complain complain) {
        this.complain = complain;
    }


         
         
      public abstract void  Reject_Complain();
      public abstract void Respond_Complain();
       public abstract void  Pending_Complain();
      public abstract void Reconsider_Complain();


      
}
