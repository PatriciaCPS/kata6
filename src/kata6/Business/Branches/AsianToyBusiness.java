
package kata6.Business.Branches;

import kata6.Business.ToyBusiness;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AsianCarToy;
import kata6.toyproducts.models.AsianHelicopterToy;

/**
 *
 * @author Patricia
 */
public class AsianToyBusiness extends ToyBusiness{
   public Toy createToy(String juguete){
    
        Toy toy = null;
        switch(juguete){
           case "car":
            toy = new AsianCarToy( serialNumberGenerator.next());
            toy.pack();
            toy.label(); 
            break;
           case "helicopter":
            toy = new AsianHelicopterToy( serialNumberGenerator.next());
            toy.pack();
            toy.label(); 
            break;

       }
        return toy;
    }
}
