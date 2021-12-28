
package kata6.Factories.Regionalfactories;

import kata6.Factories.ToyFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AmericanCarToy;
import kata6.toyproducts.models.AmericanHelicopterToy;


public class AmericanToyFactory extends ToyFactory {
    @Override
    public Toy createToy(String type){
        switch(type){
           case "car":
            return new AmericanCarToy( serialNumberGenerator.next());
           case "helicopter":
            return new AmericanHelicopterToy( serialNumberGenerator.next());
           default:
               return null;
       }
    }
}
