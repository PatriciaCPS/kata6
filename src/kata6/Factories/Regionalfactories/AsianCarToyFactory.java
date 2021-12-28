
package kata6.Factories.Regionalfactories;

import kata6.Factories.ToyFactory;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AsianCarToy;



public class AsianCarToyFactory extends ToyFactory {
   
    @Override
    public Toy createToy(Integer serialNumber){
        return new AsianCarToy( serialNumber);
    }
    
}
