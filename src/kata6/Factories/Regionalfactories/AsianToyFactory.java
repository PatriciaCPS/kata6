
package kata6.Factories.Regionalfactories;

import kata6.Factories.ToyFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AsianCarToy;
import kata6.toyproducts.models.AsianHelicopterToy;



public class AsianToyFactory extends ToyFactory {
   
    @Override
    public Toy createToy(String type){
        switch(type){
           case "car":
            return new AsianCarToy( serialNumberGenerator.next());
           case "helicopter":
            return new AsianHelicopterToy( serialNumberGenerator.next());
           default:
               return null;

       }
    }
    
}
