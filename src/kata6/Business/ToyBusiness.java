
package kata6.Business;

import kata6.Factories.ToyFactory;
import kata6.toyproducts.Toy;



public class ToyBusiness {
    
    private final ToyFactory toyFactory;
    

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }

   
   
   public Toy produceToy(String type){
       return this.toyFactory.produceToy(type);
       
   }
   

}
