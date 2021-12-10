
package kata6.Business.Branches;

import kata6.Business.ToyBusiness;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AmericanCarToy;
import kata6.toyproducts.models.AmericanHelicopterToy;

/**
 *
 * @author Patricia
 */
public class AmericanToyBusiness extends ToyBusiness{
    public Toy createToy(String juguete){
    
        Toy toy = null;
        switch(juguete){
           case "car":
            toy = new AmericanCarToy( serialNumberGenerator.next());
            toy.pack();
            toy.label(); 
            break;
           case "helicopter":
            toy = new AmericanHelicopterToy( serialNumberGenerator.next());
            toy.pack();
            toy.label(); 
            break;

       }
        return toy;
    }
}
